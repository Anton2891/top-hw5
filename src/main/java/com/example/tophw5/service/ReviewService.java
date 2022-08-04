package com.example.tophw5.service;

import com.example.tophw5.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewInstitutionById(Integer id);
    List<Review> getRatingInstitutionById(Integer id);
    void addReview(Integer institutionId, Integer rating, String review);
    void refactorReviewById(Integer institutionId, String review);
}
