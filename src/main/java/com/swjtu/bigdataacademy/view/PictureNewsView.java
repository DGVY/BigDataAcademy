package com.swjtu.bigdataacademy.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("图片新闻视图")
public class PictureNewsView {

    @ApiModelProperty("图片链接")
    private String picUrl;

    @ApiModelProperty("新闻标题")
    private String title;

    public PictureNewsView(){

    }

    public PictureNewsView(String picUrl,String title){
        this.picUrl = picUrl;
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
