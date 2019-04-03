package cyberdroid.jobportal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Login;

@Repository
public interface LoginDAO {

	List<Login> validateUser(String username, String password);

	/*
	 * Integer updatePassword(Integer userId, String newPassword);
	 * 
	 * List<Login> getDetailsById(Integer userId);
	 */
}
