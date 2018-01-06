package com.swjtu.bigdataacademy.view;

import com.swjtu.bigdataacademy.entity.ScrollNews;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("滚动新闻视图")
public class ScrollNewsView {

    @ApiModelProperty("新闻标题")
    private String title;

    public ScrollNewsView(){

    }

    public ScrollNewsView(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
