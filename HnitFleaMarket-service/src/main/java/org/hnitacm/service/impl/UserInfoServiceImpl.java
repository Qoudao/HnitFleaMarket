package org.hnitacm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hnitacm.mapper.UserInfoMapper;
import org.hnitacm.pojo.UserInfo;
import org.hnitacm.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
