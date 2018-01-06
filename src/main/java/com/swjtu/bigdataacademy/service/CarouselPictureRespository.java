package com.swjtu.bigdataacademy.service;

import com.swjtu.bigdataacademy.entity.CarouselPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarouselPictureRespository extends JpaRepository<CarouselPicture, String>{

    CarouselPicture findByBigPic(String url);
}
