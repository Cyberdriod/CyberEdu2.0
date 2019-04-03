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

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {

		// get data
		System.out.println("login controller called.");
		String loginuser = request.getParameter("email");
		String password = request.getParameter("password");

		// process data
		HttpSession session = request.getSession();
		System.out.println("old session : " + session.getId());
		System.out.println("session last access time : " + session.getLastAccessedTime());
		System.out.println("max inactive time interval : " + session.getMaxInactiveInterval());
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
			session.setMaxInactiveInterval(0);
			System.out.println("new session:" + session.getId());
		}

		int dbUsrId = 0;
		String dbEmail = null;
		String dbMobile = null;
		String dbPass = null;

		List<Login> list = loginImpl.validateUser(loginuser, password);

		for (Login login : list) {
			dbUsrId = login.getId();
			System.out.println("user id from database : " + dbUsrId);
			dbEmail = login.getEmail();
			System.out.println("useremail from database : " + dbEmail);
			dbMobile = login.getMobileno();
			System.out.println("mobile no from database : " + dbMobile);
			dbPass = login.getPassword();
			System.out.println("password from database : " + dbPass);
		}

		if (loginuser.equals(dbEmail) && password.equals(dbPass)) {
			

			request.getSession().setAttribute("userId", dbUsrId);
			request.getSession().setAttribute("userEmail", dbEmail);
			System.out.println(dbUsrId + " " + dbEmail);
			System.out.println("success login");

			
			Msg91Test.sendSms("8856868123", "Welcome to CyberEdu Job Portal");
			
			return new ModelAndView("stuDashboard", "Message", "Login successful");
		} else {
			return new ModelAndView("index", "Message", "Login Falied.!");
		}

	}

}
