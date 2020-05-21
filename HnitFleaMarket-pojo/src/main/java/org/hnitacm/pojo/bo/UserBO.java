package org.hnitacm.pojo.bo;

import lombok.Data;

/**
 * @program: HnitFleaMarket
 * @description:
 * @author: Leo
 * @date: 2020-05-22 01:40
 **/
@Data
public class UserBO {
    private String username;
    private String password;
    private String confirmPassword;
    private String telephone;
}
