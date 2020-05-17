package com.huihe.wj.controller;

import com.huihe.wj.entity.User;
import com.huihe.wj.result.Result;
import com.huihe.wj.result.ResultFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
@CrossOrigin
public class LoginController {

    @PostMapping(value = "/api/login")
    public Result login(@RequestBody User requestUser) {

        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if(Objects.equals("admin", username) && Objects.equals("123456", requestUser.getPassword())){
            return ResultFactory.buildSuccessResult(username);
        }else{
            return ResultFactory.buildFailResult("账号或密码错误");
        }
    }

}

