package com.wildcodeschool.gamenews.controller;

import com.wildcodeschool.gamenews.model.Review;
import com.wildcodeschool.gamenews.repository.ReviewDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsroomController {

    private final ReviewDao repository;

    public NewsroomController(
            // TODO : test with "videoReviewRepository" qualifier
            @Qualifier("articleReviewRepository") ReviewDao repositoryInjected
    ) {
        this.repository = repositoryInjected;
    }

    @GetMapping("/review")
    @ResponseBody
    public Review showReview(@RequestParam(required = false, defaultValue = "Untitled") String game) {

        repository.sendGame(game);
        repository.review();
        return repository.getReview();
    }
}
