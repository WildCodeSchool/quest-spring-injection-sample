package com.wildcodeschool.gamenews.controller;

import com.wildcodeschool.gamenews.model.Review;
import com.wildcodeschool.gamenews.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsroomController {

    @Autowired
    // TODO : test with "videoReviewRepository" qualifier
    @Qualifier("articleReviewRepository")
    private ReviewRepository repository;

    @GetMapping("/review")
    @ResponseBody
    public Review showReview(@RequestParam(required = false, defaultValue = "Untitled") String game) {

        repository.sendGame(game);
        repository.review();
        return repository.getReview();
    }
}
