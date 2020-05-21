package org.hnitacm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.hnitacm.service.UserInfoService;
import org.hnitacm.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HnitFleaMarket
 * @description: 登录注册
 * @author: Leo
 * @date: 2020-05-21 21:46
 **/

@Api(value = "注册登录", tags = "用户注册/登录的相关接口")
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "用户名是否存在", notes = "用户名是否存在", httpMethod = "GET")
    @GetMapping("/usernameIsExist")
    public JSONResult usernameIsExist(@RequestParam String username) {
        if (StringUtils.isBlank(username)) {
            return JSONResult.errorMsg("用户名不能为空");
        }
        boolean isExist = userInfoService.queryUsernameIsExist(username);
        if (isExist) {
            return JSONResult.errorMsg("用户名已经存在");
        }

        return JSONResult.ok();
    }
}
