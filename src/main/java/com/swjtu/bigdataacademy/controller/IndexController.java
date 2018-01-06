package com.swjtu.bigdataacademy.controller;

import com.swjtu.bigdataacademy.Respond.CarouselPictureRespond;
import com.swjtu.bigdataacademy.Respond.PictureNewsRespond;
import com.swjtu.bigdataacademy.Respond.Respond;
import com.swjtu.bigdataacademy.Respond.ScrollNewsRespond;
import com.swjtu.bigdataacademy.entity.CarouselPicture;
import com.swjtu.bigdataacademy.entity.PictureNews;
import com.swjtu.bigdataacademy.entity.ScrollNews;
import com.swjtu.bigdataacademy.service.CarouselPictureRespository;
import com.swjtu.bigdataacademy.service.PictureNewsRespository;
import com.swjtu.bigdataacademy.service.ScrollNewsRespository;
import com.swjtu.bigdataacademy.view.CarouselPictureView;
import com.swjtu.bigdataacademy.view.PictureNewsView;
import com.swjtu.bigdataacademy.view.ScrollNewsView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api("主页")
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ScrollNewsRespository scrollNewsRes;

    @Autowired
    private PictureNewsRespository picNewsRes;

    @Autowired
    private CarouselPictureRespository carouselPicRes;

    @ApiOperation("获取滚动条新闻")
    @RequestMapping(value =  "/scrollNews/get",method = RequestMethod.GET)
    public Respond scrollNewsGET(){
        List<ScrollNews> scrollNews= scrollNewsRes.findAll();

        Respond respond = new Respond();
        if(scrollNews.size() != 0){
            for (ScrollNews scrollNew : scrollNews) {
                respond.addData(new ScrollNewsRespond(scrollNew.getTitle()));
            }
            respond.setCode(0);
        }
        else{
            respond.setCode(1);
        }



        return respond;
    }

    @ApiOperation("保存滚动条新闻")
    @RequestMapping(value = "/scrollNews/save", method = RequestMethod.POST)
    public Respond scrollNewsSave(@RequestBody ScrollNewsView scrollNew){
        ScrollNews s = new ScrollNews();
        s.setTitle(scrollNew.getTitle());

        Respond respond = new Respond();
        respond.setCode(1);
        try{
            scrollNewsRes.save(s);
        }
        catch (Exception e){
            respond.setCode(0);
        }

        return respond;
    }

    @ApiOperation("获取图片新闻")
    @RequestMapping(value = "/PictureNews/get",method = RequestMethod.GET)
    public Respond pictureNewsGET(){
        List<PictureNews> picNews = picNewsRes.findAll();

        Respond respond = new Respond();
        if(picNews.size() != 0){
            for (PictureNews picNew : picNews) {
                respond.addData(new PictureNewsRespond(picNew.getPicUrl(), picNew.getTitle()));
            }
            respond.setCode(0);
        }
        else{
            respond.setCode(1);
        }

        return respond;
    }

    @ApiOperation("保存图片新闻")
    @RequestMapping(value = "/PictureNews/save", method = RequestMethod.POST)
    public Respond pictureNewsSave(@RequestBody PictureNewsView picNew){
        PictureNews p = new PictureNews();
        p.setTitle(picNew.getTitle());
        p.setPicUrl(picNew.getPicUrl());

        Respond respond = new Respond();
        respond.setCode(1);
        try{
            picNewsRes.save(p);
        }
        catch (Exception e){
            respond.setCode(0);
        }

        return respond;
    }

    @ApiOperation("获取轮播图片")
    @RequestMapping(value = "/CarousePicture/get",method = RequestMethod.GET)
    public Respond carousePictureGET(){
        List<CarouselPicture> carouselPic = carouselPicRes.findAll();

        Respond respond = new Respond();
        if(carouselPic.size() != 0){
            for (CarouselPicture aCarouselPic : carouselPic) {
                respond.addData(new CarouselPictureRespond(aCarouselPic.getBigPic()));
            }
            respond.setCode(0);
        }
        else{
            respond.setCode(1);
        }

        return respond;
    }

    @ApiOperation("保存轮播图片")
    @RequestMapping(value = "/CarousePicture/save", method = RequestMethod.POST)
    public Respond carousePictureSave(@RequestBody CarouselPictureView CarouselPic){
        CarouselPicture c = new CarouselPicture();
        c.setBigPic(CarouselPic.getBigPic());

        Respond respond = new Respond();
        respond.setCode(1);
        try{
            carouselPicRes.save(c);
        }
        catch (Exception e){
            respond.setCode(0);
        }

        return respond;
    }
}
