package com.m4gik.signup;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.m4gik.account.*;
import com.m4gik.support.web.*;

@Controller
public class SignupController {

    private static final String SIGNUP_VIEW_NAME = "signup/signup";

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "signup")
	public String signup(Model model) {
		throw new IllegalStateException("Signup is not allowed"); 
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String signup(@Valid @ModelAttribute SignupForm signupForm, Errors errors, RedirectAttributes ra) {
		throw new IllegalStateException("Signup is not allowed"); 
	}
}
