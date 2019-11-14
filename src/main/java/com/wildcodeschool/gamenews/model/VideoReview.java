package com.wildcodeschool.gamenews.model;

import org.springframework.stereotype.Component;

@Component
public class VideoReview extends Review {

    @Override
    public void setTitle(String title) {
        super.setTitle("Video of " + title);
    }
}
