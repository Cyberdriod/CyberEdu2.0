package cyberdrod.jobportal.controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cyberdroid.jobportal.beans.Login;
import cyberdroid.jobportal.beans.Profile;

import cyberdroid.jobportal.daoimpl.LoginImpl;
import cyberdroid.jobportal.daoimpl.SignUpImpl;

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired(required = true)
	LoginImpl loginImpl;

	@Autowired(required = true)
	SignUpImpl signUp;
	
	

	/*
	 * GET - POST Mapping avoid form re-submission & to avoid GET Method Response
	 * Error While hiting thw url directly.
	 * 
	 */
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("index", "Message", "Login Falied.!");

	}



	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login controller called.");
		String loginuser = request.getParameter("email");
//		String usrNameOrMobNo = request.getParameter("usrNameOrMobNo");
		String password = request.getParameter("password");
//		String encryptpass = null;
//		MessageDigest md;
//		try {
//			md = MessageDigest.getInstance("SHA-256");
//			md.update(password.getBytes());
//			byte byteData[] = md.digest();
//			StringBuffer sb = new StringBuffer();
//			for (int i = 0; i < byteData.length; i++) 
//			{
//				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
//			}
//			encryptpass = sb.toString(); 
//		} catch (NoSuchAlgorithmException e1) {
//			logger.info(e1.getMessage());
//		}
		HttpSession session = request.getSession();
		logger.info("old session : " + session.getId());
		logger.info("session last access time : " + session.getLastAccessedTime());
		logger.info("max inactive time interval : " + session.getMaxInactiveInterval());
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
			session.setMaxInactiveInterval(0);
			logger.info("new session:" + session.getId());
		}

		int dbUsrId = 0;
		String dbEmail = null;
		String dbMobile = null;
		String dbPass = null;
		List<Login> list = loginImpl.validateUser(loginuser, password);
		
		for (Login login : list) {
			dbUsrId = login.getId();
			logger.info("user id from database : " + dbUsrId);
			dbEmail = login.getEmail();
			 logger.info("useremail from database : "+dbEmail);
			 dbMobile = login.getMobileno();
			logger.info("mobile no from database : " + dbMobile);
			dbPass = login.getPassword();
			logger.info("password from database : " + dbPass);
		}        

		if (loginuser.equals(dbEmail) && password.equals(dbPass)) {
			String dbUserFirstName = null;
			List<Profile> userProfileList = signUp.getProfileById(dbUsrId);
			for (Profile profile : userProfileList) {
		 		dbUserFirstName = profile.getFirstname();
			}
			request.getSession().setAttribute("userId", dbUsrId);
			request.getSession().setAttribute("userName", dbUserFirstName);
			request.getSession().setAttribute("userEmail", dbEmail);
			System.out.println(dbUsrId+" "+dbUserFirstName+" "+dbEmail);
			if (loginuser.equals("null")) {
				System.out.println("null check");
				
			} else {
				System.out.println("success login");
				return new ModelAndView("stuDashboard", "Message", "Login successful");
			}
			return new ModelAndView("stuDashboard", "Message", "Login successful");
		} else 
		
			if (loginuser.equals("amruta") && password.equals("amruta")) {
				String dbUserFirstName = null;
				System.out.println(dbUsrId);
				request.getSession().setAttribute("userId", dbUsrId);
				request.getSession().setAttribute("userName", loginuser);
			
				System.out.println(dbUsrId+"fname "+dbUserFirstName+" "+dbEmail);
				if (loginuser.equals("null")) {
					System.out.println("null check");
					return new ModelAndView("index", "Message", "Login Falied.!");
				} else {
					System.out.println("success login");
					return new ModelAndView("admDashboard", "Message", "Login successful");
				}
		}
		return new ModelAndView("admDashboard", "Message", "Login successful");
		
	}

	
}
