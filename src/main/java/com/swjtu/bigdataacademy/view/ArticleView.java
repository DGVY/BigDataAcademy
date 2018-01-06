package com.swjtu.bigdataacademy.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("文章视图")
public class ArticleView {

    @ApiModelProperty("文章ID")
    private String id;

    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("文章日期")
    private String date;

    @ApiModelProperty("文章正文")
    private String content;

    public ArticleView(){

    }

    public ArticleView(String id, String title,String date,String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
