package com.rahul.ecommerce.service;

import com.rahul.ecommerce.exception.ProductException;
import com.rahul.ecommerce.modal.Rating;
import com.rahul.ecommerce.modal.User;
import com.rahul.ecommerce.request.RatingRequest;

import java.util.List;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
