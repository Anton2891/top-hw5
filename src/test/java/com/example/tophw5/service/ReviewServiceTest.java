package com.example.tophw5.service;

import com.example.tophw5.AppContextTest;
import lombok.var;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReviewServiceTest extends AppContextTest {

    @Autowired
    private ReviewService reviewService;

    @BeforeAll
    void setUp() {
        String RESTAURANT_WITH_REVIEW = "restaurant_with_review";
        reviewService.addReview(6, 15, RESTAURANT_WITH_REVIEW);
        String RESTAURANT_WITHOUT_REVIEW = "restaurant_without_review";
        reviewService.addReview(7, 5, RESTAURANT_WITHOUT_REVIEW);
    }

    @Test
    void addReview(){
        String review = "review_test";
        Integer rating = 6;
        Integer id = 8;
        reviewService.addReview(id, rating, review);
    }

    @Test
    void getReviewInstitutionById(){
        Integer id = 8;
        assertNotNull(reviewService.getReviewInstitutionById(id));
    }

    @Test
    void getRatingInstitutionById(){
        Integer id = 8;
        assertNotNull(reviewService.getRatingInstitutionById(id));
    }

    @Test
    void refactorReviewById(){
        Integer id = 6;
        var oldReviews = reviewService.getReviewInstitutionById(id);
        reviewService.refactorReviewById(id, "new_test_review");
        var newReviews = reviewService.getReviewInstitutionById(id);
        assertNotSame(oldReviews, newReviews);
    }

}
