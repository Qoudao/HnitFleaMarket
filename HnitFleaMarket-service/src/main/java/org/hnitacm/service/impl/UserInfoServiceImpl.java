package org.hnitacm.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hnitacm.mapper.UserInfoMapper;
import org.hnitacm.pojo.UserInfo;
import org.hnitacm.pojo.bo.UserBO;
import org.hnitacm.service.UserInfoService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

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
        userInfoQueryWrapper.eq("user_name", username);
        UserInfo result = userInfoMapper.selectOne(userInfoQueryWrapper);
        return result != null;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public UserInfo createUser(UserBO userBo) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userBo.getUsername());
        userInfo.setUsePassword(userBo.getPassword());
        userInfo.setUserStatus(0);
        userInfo.setUserTelephone(userBo.getTelephone());
        userInfo.setUserEmail(" ");
        userInfo.setCreated(LocalDateTime.now());
        userInfo.setModified(LocalDateTime.now());
        userInfoMapper.insert(userInfo);
        return userInfo;
    }


}
