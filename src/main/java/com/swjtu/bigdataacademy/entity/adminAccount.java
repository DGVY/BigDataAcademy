package com.swjtu.bigdataacademy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_adminaccount")
public class adminAccount implements Serializable {

    // 用户名
    @Id
    @Column(name = "Account",length = 20,nullable = false,unique = true)
    private String account;

    // 密码
    @Column(name = "Password",length = 20,nullable = false)
    private String password;

    protected adminAccount(){

    }

    public adminAccount(String account, String password){
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String setAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword() {
        return password;
    }
}
