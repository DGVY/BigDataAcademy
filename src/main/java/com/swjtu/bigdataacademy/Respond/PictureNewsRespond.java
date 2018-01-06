package com.swjtu.bigdataacademy.Respond;


public class PictureNewsRespond {

    private String picUrl;

    private String title;

    public PictureNewsRespond(String picUrl, String title){
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
