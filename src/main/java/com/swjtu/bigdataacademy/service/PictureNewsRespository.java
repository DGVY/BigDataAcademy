package com.swjtu.bigdataacademy.service;

import com.swjtu.bigdataacademy.entity.PictureNews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureNewsRespository extends JpaRepository<PictureNews, String>{

    PictureNews findByTitle(String title);
}
