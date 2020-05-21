package org.hnitacm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.hnitacm.pojo.UserInfo;
import org.hnitacm.pojo.bo.UserBO;
import org.hnitacm.service.UserInfoService;
import org.hnitacm.utils.CookieUtils;
import org.hnitacm.utils.JSONResult;
import org.hnitacm.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/regist")
    public JSONResult regist(
            @RequestBody UserBO userBO,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String confirmPassword = userBO.getPassword();

        if (StringUtils.isBlank(username)
                || StringUtils.isBlank(password) || StringUtils.isBlank(confirmPassword)) {
            return JSONResult.errorMsg("用户名或密码不能为空");
        }
        if (userInfoService.queryUsernameIsExist(username)) {
            return JSONResult.errorMsg("用户名已经存在");
        }
        if (!password.equals(confirmPassword)) {
            return JSONResult.errorMsg("两次密码输入不一致");
        }
        UserInfo userResult = userInfoService.createUser(userBO);
        CookieUtils.setCookie(request, response, "userInfo", JsonUtils.objectToJson(userResult), true);
        return JSONResult.ok(userResult);
    }
}
