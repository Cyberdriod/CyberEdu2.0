package cyberdrod.jobportal.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cyberdroid.jobportal.beans.Admpostedjob;
import cyberdroid.jobportal.beans.admlistedjob;
import cyberdroid.jobportal.daoimpl.SaveUpImpl;





@Controller
public class SaveUpController
{
private static final Logger logger = Logger.getLogger(SaveUpController.class);
	
	@Autowired(required=true)
	SaveUpImpl saveupimpl;
	@RequestMapping(value="/postjob",method=RequestMethod.POST)
	public ModelAndView saveAdmposted(@ModelAttribute("Admpostedjob")Admpostedjob ap,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		logger.info("*********************admposted Controller Called**********************");
//		
		saveupimpl.save(ap);
		
		
		return new ModelAndView("admRecurters","message","Registration Successful");
	}
	
	@RequestMapping(value="/admlistedjob",method=RequestMethod.POST)
	public ModelAndView saveAdmlisted(@ModelAttribute("admlistedjob") admlistedjob al,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		logger.info("*********************admlistedjob Controller Called**********************");
//		
		
		saveupimpl.save(al);
		
		
		return new ModelAndView("index","message","Registration Successful");
	}
	
	@RequestMapping(value="/jobid",method=RequestMethod.POST)
	public ModelAndView jobid(@ModelAttribute("admlistedjob") admlistedjob al,HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		logger.info("*********************admlistedjob Controller Called**********************");	
		String id=request.getParameter("jobid");
		System.out.println(id);
	    saveupimpl.jobid(id);
	
		
		return new ModelAndView("admListedCompany","message","Registration Successful");
	}
	@RequestMapping(value="/admedit",method=RequestMethod.POST)
	public ModelAndView studentedit(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		
		logger.info("*********************admstudentedit Controller Called**********************");	
		String id=request.getParameter("userid");
		String userid=request.getParameter("expid");
		HttpSession session=request.getSession();
		session.setAttribute("userid",id);
		session.setAttribute("expid",userid);
		return new ModelAndView("admStudentEdit","message","Registration Successful");
	}
	
	
	
	
}
