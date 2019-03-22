package cyberdroid.jobportal.dao;

import org.springframework.stereotype.Service;

import cyberdroid.jobportal.beans.Admpostedjob;
import cyberdroid.jobportal.beans.admlistedjob;
@Service
public interface SaveUpDAO {
	void save(Admpostedjob ap);
	void save(admlistedjob al);
	void jobid(String id);
}
