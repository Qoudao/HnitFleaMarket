package org.hnitacm.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hnitacm.enums.UserTypeEnum;
import org.hnitacm.mapper.UserInfoMapper;
import org.hnitacm.pojo.UserInfo;
import org.hnitacm.pojo.bo.UserBO;
import org.hnitacm.service.UserInfoService;
import org.hnitacm.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
        userInfoQueryWrapper.eq("username", username);
        UserInfo result = userInfoMapper.selectOne(userInfoQueryWrapper);
        return result != null;
    }

    @Override
    public UserInfo createUser(UserBO userBo) {
        String userId = sid.nextShort();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(Long.valueOf(userId));
        userInfo.setUserName(userBo.getUsername());
        try {
            userInfo.setUsePassword(MD5Utils.getMD5Str(userBo.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        userInfo.setUserStatus(UserTypeEnum.BUYER.getType());
        userInfo.setUserEmail("");
        userInfo.setCreated(LocalDateTime.now());
        userInfo.setModified(LocalDateTime.now());
        return userInfo;
    }


}
