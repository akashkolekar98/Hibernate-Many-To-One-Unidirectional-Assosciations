package com.jsp.product.review.controller;

import com.jsp.product.review.service.ReviewService;

public class ReadReview {

	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();

		reviewService.getReviewById(1);
	}

}
