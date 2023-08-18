package com.office.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String showSignupPage() {
		return "signup";
	}
	
	@GetMapping("/forgot-password")
	public String showForgotPasswordPage() {
		return "forgot_password";
	}
}
