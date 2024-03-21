package com.rahul.ecommerce.service;

import com.rahul.ecommerce.exception.ProductException;
import com.rahul.ecommerce.modal.Review;
import com.rahul.ecommerce.modal.User;
import com.rahul.ecommerce.request.ReviewRequest;

import java.util.List;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
