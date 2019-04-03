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

import cyberdroid.jobportal.beans.Education;
import cyberdroid.jobportal.beans.Experience;
import cyberdroid.jobportal.beans.Login;
import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Project;
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
	public ModelAndView saveProfile(@ModelAttribute("Profile") Profile profile,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		logger.info("*********************Profile Controller Called**********************");
	
		String useremail=request.getParameter("email");
		String mobileno=request.getParameter("primarymobileno");
		System.out.println(useremail+" "+mobileno);

		if(signUpImpl.existUser(useremail, mobileno))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			signUpImpl.updateUser(profile, userid);
			return new ModelAndView("index","message","Already Registerd");
		}else {
			System.out.println("Else Part :: signupControler.");
			signUpImpl.save(profile);
			return new ModelAndView("index","message","Registration Successful");
		}
		
		
	}
	
	
	@RequestMapping(value="/education",method=RequestMethod.POST)
	public ModelAndView saveEducation(@ModelAttribute("Education") Education edu,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************Education Controller Called**********************");
			
			signUpImpl.saveeducation(edu);
		
		
		return new ModelAndView("stueducational","message","Educational details saved Successful");
	}
	@RequestMapping(value="/Experience",method=RequestMethod.POST)
	public ModelAndView saveExperience(@ModelAttribute("Experience") Experience exp,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************Experience Controller Called**********************");
			
			signUpImpl.saveexperience(exp);
		
		
		return new ModelAndView("stuexperience","message","Experience details saved Successful");
	}
	@RequestMapping(value="/edudelete",method=RequestMethod.POST)
	public ModelAndView edudelete(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************Education delete  Controller Called**********************");
			
		int edudelete=Integer.parseInt(request.getParameter("eduid"));
		System.out.println("The deleted value is ="+edudelete);
		signUpImpl.edudelete(edudelete);
		
		
		return new ModelAndView("stueducational","message","Educational details saved Successful");
	}
	@RequestMapping(value="/expdelete",method=RequestMethod.POST)
	public ModelAndView expdelete(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************Education delete  Controller Called**********************");
			
		int expdelete=Integer.parseInt(request.getParameter("expid"));
		System.out.println("The deleted value is ="+expdelete);
		signUpImpl.expdelete(expdelete);
		
		
		return new ModelAndView("stuexperience","message","Educational details saved Successful");
	}
	@RequestMapping(value="/project",method=RequestMethod.POST)
	public ModelAndView saveProject(@ModelAttribute("Project") Project pro,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************project Controller Called**********************");
			
			signUpImpl.saveproject(pro);
		
		
		return new ModelAndView("stuproject","message","Educational details saved Successful");
	}
	@RequestMapping(value="/prodelete",method=RequestMethod.POST)
	public ModelAndView prodelete(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
			logger.info("*********************Project delete  Controller Called**********************");
			
		int prodelete=Integer.parseInt(request.getParameter("proid"));
		System.out.println("The deleted value is ="+prodelete);
		signUpImpl.prodelete(prodelete);
		
		
		return new ModelAndView("stuexperience","message","Educational details saved Successful");
	}
}
