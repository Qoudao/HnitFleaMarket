package org.hnitacm.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.hnitacm.pojo.UserInfo;
import org.hnitacm.pojo.bo.UserBO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
public interface UserInfoService extends IService<UserInfo> {

    public boolean queryUsernameIsExist(String username);

    public UserInfo createUser(UserBO userBo);
}
