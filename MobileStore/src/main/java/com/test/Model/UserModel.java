package com.test.Model;


import java.io.Serializable;

import com.test.MobileDTO.Cart;

public class UserModel implements Serializable{

	private static final long serialVersionUID = 1L;


	private int cartLineCount ; 
	
	
	private String  mobile ;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	private String id;
	public int getCartLineCount() {
		return cartLineCount;
	}
	public void setCartLineCount(int cartLineCount) {
		this.cartLineCount = cartLineCount;
	}
	
	private String pass ;
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	private String fullName;
	private String email;
	private String role;
	private Cart cart;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fullName=" + fullName + ", email=" + email + ", role=" + role + ", cart="
				+ cart + "]";
	}
	
	
}
