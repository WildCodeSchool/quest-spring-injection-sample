package com.wildcodeschool.gamenews.repository;

import com.wildcodeschool.gamenews.model.Review;

public interface ReviewDao {

    void sendGame(String game);

    void review();

    Review getReview();
}
