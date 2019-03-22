package cyberdrod.jobportal.controllers;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.dao.SignUpDAO;
import cyberdroid.jobportal.daoimpl.SignUpImpl;
import cyberdroid.jobportal.services.Mailclass;
import cyberdroid.jobportal.services.SmsClass;


@Controller
public class SignUpController {
	
	private static final Logger logger = Logger.getLogger(SignUpController.class);
	
	@Autowired(required=true)
	SignUpImpl signUpImpl;
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView saveProfile(@ModelAttribute("Profile") Profile profile,HttpServletRequest request,HttpServletResponse response) 
	{
		logger.info("*********************Profile Controller Called**********************");
		signUpImpl.save(profile);
		return new ModelAndView("index","message","Registration Successful");
	}
	
	
	
}
