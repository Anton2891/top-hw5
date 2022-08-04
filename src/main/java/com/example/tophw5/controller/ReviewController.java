package com.example.tophw5.controller;

import com.example.tophw5.entity.Review;
import com.example.tophw5.service.impl.ReviewServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ReviewController {
    private final ReviewServiceImpl service = new ReviewServiceImpl();

    @GetMapping("rev/{id}")
    public List<Review> getReviewInstitutionById(@PathVariable("id") Integer id) {
        return service.getReviewInstitutionById(id);
    }

    @GetMapping("rat/{id}")
    public List<Review> getRatingInstitutionById(@PathVariable("id") Integer id) {
        return service.getRatingInstitutionById(id);
    }

    /** Виктор, если не сложно, покажите как надо было передать и обработать JSON.
     * В интернете много литературы по этому поводу, ну я так ничего и не понял.
     * @param review
     */
    @PostMapping("add/rev")
    @ResponseStatus(HttpStatus.CREATED)
    public void addReview(@RequestParam (value = "institutionId") Integer institutionId,
            @RequestParam(value = "rating") Integer rating,
            @RequestParam(value = "review") String review){
        service.addReview(institutionId, rating, review);
//        service.addReview(review.getInstitutionId(), review.getRating(), review.getReview());
    }

    @PostMapping("ref/rev/{institutionId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void refactorReviewById(@RequestParam(value = "review") String review,
                                   @PathVariable Integer institutionId) {
        service.refactorReviewById(institutionId, review);
    }
}
