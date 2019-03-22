package cyberdroid.jobportal.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import cyberdroid.jobportal.beans.Education;
import cyberdroid.jobportal.beans.Experience;
import cyberdroid.jobportal.beans.Profile;
import cyberdroid.jobportal.beans.Project;

@Service
public interface SignUpDAO {

	void save(Profile profile);

	void saveeducation(Education edu);

	void edudelete(int eduid);

	void saveexperience(Experience exp);

	void expdelete(int expid);

	void saveproject(Project pro);

	void prodelete(int prodelete);

	List<Profile> getProfileById(Integer userId);

//	  updatePersonalDetailsById(Profile profile, Integer userId); void
//	  void updateOfficeDetailsById(Profile profile, Integer userId); List<Profile>
	boolean existUser(String userEmail, String mobile);

}
