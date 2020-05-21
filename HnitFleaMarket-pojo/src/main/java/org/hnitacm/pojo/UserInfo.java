package org.hnitacm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String usePassword;

    /**
     * 手机号
     */
    private String userTelephone;

    /**
     * 登录状态
     */
    private Integer userStatus;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 用户类型
     */
    private Integer userType;

    private LocalDateTime created;

    private LocalDateTime modified;

    /**
     * 卖家id 外键关系(seller_info.seller_id)
     */
    private Long sellerId;


}
