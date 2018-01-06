package com.swjtu.bigdataacademy.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.swjtu.bigdataacademy.entity.adminAccount;

public interface adminAccountRepository extends JpaRepository<adminAccount,String>{

    adminAccount findByAccount(String account);

}
