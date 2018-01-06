package com.swjtu.bigdataacademy.service;

import com.swjtu.bigdataacademy.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRespository extends JpaRepository<Article,String>{

    Article findById(String id);

    Article findByTitle(String title);
}
