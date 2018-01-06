package com.swjtu.bigdataacademy.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("轮播图片视图")
public class CarouselPictureView {

    @ApiModelProperty("图片链接")
    private String bigPic;

    public CarouselPictureView(){

    }

    public CarouselPictureView(String bigPic){
        this.bigPic = bigPic;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setPicUrl(String picUrl) {
        this.bigPic = picUrl;
    }
}
