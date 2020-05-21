package org.hnitacm.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: HnitFleaMarket
 * @description:
 * @author: Leo
 * @date: 2020-05-22 02:11
 **/
@AllArgsConstructor
@Getter
public enum UserTypeEnum {
    BUYER(0, "买家"),
    SELLER(1, "卖家"),
    BUYERANDSELLER(2, "既是卖家也是买家");

    private final Integer type;
    private final String description;


}
