package com.swjtu.bigdataacademy.service;

import com.swjtu.bigdataacademy.entity.ScrollNews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrollNewsRespository extends JpaRepository<ScrollNews, String>{

    ScrollNews findByTitle(String title);

}
