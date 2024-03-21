package com.rahul.ecommerce.service;

import com.rahul.ecommerce.exception.ProductException;
import com.rahul.ecommerce.modal.Cart;
import com.rahul.ecommerce.modal.CartItem;
import com.rahul.ecommerce.modal.User;
import com.rahul.ecommerce.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
