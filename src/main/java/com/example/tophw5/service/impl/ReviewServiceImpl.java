package com.example.tophw5.service.impl;

import com.example.tophw5.dao.DaoImpl;
import com.example.tophw5.entity.Review;
import com.example.tophw5.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final DaoImpl dao = new DaoImpl();

    @Override
    public List<Review> getReviewInstitutionById(Integer id) {
        return dao.getReviewInstitutionById(id);
    }

    @Override
    public List<Review> getRatingInstitutionById(Integer id) {
        return dao.getRatingInstitutionById(id);
    }

    @Override
    public void addReview(Integer institutionId, Integer rating, String review) {
        dao.addReview(institutionId, rating, review);
    }

    @Override
    public void refactorReviewById(Integer institutionId, String review) {
        dao.refactorReviewById(institutionId, review);
    }
}
