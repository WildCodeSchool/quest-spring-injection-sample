package com.wildcodeschool.gamenews.model;

import org.springframework.stereotype.Component;

@Component
public class ArticleReview extends Review {

    @Override
    public void setTitle(String title) {
        super.setTitle("Article of " + title);
    }
}
