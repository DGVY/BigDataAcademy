package com.swjtu.bigdataacademy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.swjtu.bigdataacademy.view.adminAccountView;
import com.swjtu.bigdataacademy.service.adminAccountRepository;
import com.swjtu.bigdataacademy.entity.adminAccount;

@Api("登录管理")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private adminAccountRepository adminRes;

    @ApiOperation("用户登录")
    @RequestMapping(method = RequestMethod.POST)
    public adminAccountView login(@RequestBody adminAccountView loginAccount){

        adminAccount result = adminRes.findByAccount(loginAccount.getAccount());

        adminAccountView test = new adminAccountView(result.getAccount(),result.getPassword());

        return test;
    }

    @ApiOperation("测试")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public adminAccountView loginTestGET()
    {
        adminAccountView admin = new adminAccountView("abc","asdf");
        return admin;
    }

}
