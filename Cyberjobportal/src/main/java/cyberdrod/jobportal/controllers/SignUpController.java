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
//		String name=(String) request.getAttribute("firstname");
//		String userEmail=(String) request.getAttribute("email");
//		String mobileNo=(String) request.getAttribute("primarymobileno");
//		String userpass=(String) request.getAttribute("password");
//		String mobile = null;
//		String email = null;
//		List<Profile> list= signUpImpl.existUser(userEmail, mobileNo);
//		for (Profile profile1 : list) 
//		{
//			 mobile = profile1.getPrimarymobileno();
//			 email = profile1.getEmail();
//		}
//		if(userEmail.equals(email)){
//			return new ModelAndView("index","emailmessage","Email is already exist");
//		}
//		else if(mobileNo.equals(mobile)) {
//			return new ModelAndView("index","mobilemessage","Mobile Number is already exist");
//		}else {
//		String encryptpass = null;
//		MessageDigest md;
//		try {
//				md = MessageDigest.getInstance("SHA-256");
//				md.update(userpass.getBytes());
//				byte byteData[] = md.digest();
//				StringBuffer sb = new StringBuffer();
//				for (int i = 0; i < byteData.length; i++) 
//				{
//					sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
//				}
//			    encryptpass = sb.toString(); 
//		    }
//		catch (NoSuchAlgorithmException e1) {
//			logger.info(e1.getMessage());
//		}
//		 signUpImpl.save( profile);//signup
//	    
//		 //message sending after user signup successfully
//	     String smsMessage = " Hi "+ name +""
//	     				   + " Thanks for registering with"
//	     				   + " www.propselect.com";
//	     SmsClass.smsSender(mobileNo, smsMessage);
//	     
//	     //mail sending afetr user signup successfully
//	     String messagepart = " Dear " +  name + ", <br><br>"
//				   			+ " Greeting's from www.propselect.com <br>"
//				   			+ " Thanku you for registering with <br>"
//				   			+ " www.propselect.com"
//				   			+ " Our representative will get back to you shortly.";
//	     String subject = "propselect.com - Received contact details";
//	     Mailclass.sendemail(userEmail, messagepart, subject);
//		}
//		
//		//check condition for sign up from both pages index & property upload
		String useremail=request.getParameter("email");
		String mobileno=request.getParameter("primarymobileno");
		System.out.println(useremail+" "+mobileno);
//		
		System.out.println(useremail+" "+mobileno);
		if(signUpImpl.existUser(useremail, mobileno))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			signUpImpl.updateUser(profile, userid);
		}else {
		signUpImpl.save(profile);
		}
		
		return new ModelAndView("index","message","Registration Successful");
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
