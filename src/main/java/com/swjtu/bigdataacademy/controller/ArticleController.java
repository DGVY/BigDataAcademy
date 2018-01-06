package com.swjtu.bigdataacademy.controller;

import com.swjtu.bigdataacademy.Respond.Respond;
import com.swjtu.bigdataacademy.entity.Article;
import com.swjtu.bigdataacademy.service.ArticleRespository;
import com.swjtu.bigdataacademy.view.ArticleView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("报道")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleRespository articleRes;

    @ApiOperation("获取文章ID")
    @RequestMapping(value = "/id/get",method = RequestMethod.GET)
    public Respond articleIDGET(){
        List<Article> articles = articleRes.findAll();

        Respond respond = new Respond();
        if(articles.size() != 0){
            for(Article aritcle : articles){
                respond.addData(aritcle.getId());
            }
            respond.setCode(0);
        }
        else{
            respond.setCode(1);
        }
        return respond;
    }

    @ApiOperation("根据ID获取标题")
    @RequestMapping(value = "/title/get",method = RequestMethod.POST)
    public Respond articleTitleGET(@RequestBody ArticleView articleView){

        Article article = articleRes.findById(articleView.getId());

        Respond respond = new Respond();
        if(article.getTitle().isEmpty()){
            respond.setCode(1);
        }
        else{
            respond.addData(article.getTitle());
            respond.setCode(0);
        }
        return respond;
    }

    @ApiOperation("根据ID获取文章正文")
    @RequestMapping(value = "/content/get",method = RequestMethod.POST)
    public Respond articleContentGET(@RequestBody ArticleView articleView){

        Article article = articleRes.findById(articleView.getId());

        Respond respond = new Respond();
        if(article.getContent().isEmpty()){
            respond.setCode(1);
        }
        else{
            respond.addData(article.getContent());
            respond.setCode(0);
        }
        return respond;

    }

}
