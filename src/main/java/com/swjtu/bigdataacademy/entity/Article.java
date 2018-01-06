package com.swjtu.bigdataacademy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "t_article")
public class Article {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    private String id;

    @Column(name = "title",nullable = true)
    private String title;

    @Column(name = "date")
    private String date;

    @Column(name = "content")
    private String content;

    public Article(){

    }

    public Article(String title){
        this.title = title;
    }

    public Article(String title,String content){
        this.title = title;
        this.content = content;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
