package com.rahul.ecommerce.service;

import com.rahul.ecommerce.exception.CartItemException;
import com.rahul.ecommerce.exception.UserException;
import com.rahul.ecommerce.modal.Cart;
import com.rahul.ecommerce.modal.CartItem;
import com.rahul.ecommerce.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
