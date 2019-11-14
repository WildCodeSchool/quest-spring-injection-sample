package com.wildcodeschool.gamenews.repository;

import com.wildcodeschool.gamenews.model.Review;

public interface ReviewRepository {

    void sendGame(String game);

    void review();

    Review getReview();
}
