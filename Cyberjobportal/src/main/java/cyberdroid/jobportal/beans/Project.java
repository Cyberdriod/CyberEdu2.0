package cyberdroid.jobportal.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Studproject")
public class Project {

	private int proid;
	private String projecttitle;;
	private String domain;
	private String role;
	private String tecnologyused;
	private String projectdate;
	private String projectdesc;
	private String userid;
//	private Profile profile;

	@Id
	@GeneratedValue
	@Column(name = "proid")
	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProjecttitle() {
		return projecttitle;
	}

	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getTecnologyused() {
		return tecnologyused;
	}

	public void setTecnologyused(String tecnologyused) {
		this.tecnologyused = tecnologyused;
	}

	public String getProjectdate() {
		return projectdate;
	}

	public void setProjectdate(String projectdate) {
		this.projectdate = projectdate;
	}

	public String getProjectdesc() {
		return projectdesc;
	}

	public void setProjectdesc(String projectdesc) {
		this.projectdesc = projectdesc;
	}

	public Project() {

		// TODO Auto-generated constructor stub
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "usr_id_fk")
//	public Profile getProfile() {
//		return profile;
//	}
//
//	public void setProfile(Profile profile) {
//		this.profile = profile;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
