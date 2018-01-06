package com.swjtu.bigdataacademy.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("管理员视图")
public class adminAccountView {

    @ApiModelProperty("账户")
    private String account;

    @ApiModelProperty("密码")
    private String password;

    public adminAccountView(){

    }

    public adminAccountView(String account, String password){
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
