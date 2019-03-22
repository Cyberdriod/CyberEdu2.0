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
public class Studproject {

	private int proid;
	private String projecttitle;;
	private String domain;
	private String tecnologyused;
	private Date projectdate;
	private String projectdesc;
	private Profile profile;

	@Id
	@GeneratedValue
	@Column(name = "id")
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

	public Date getProjectdate() {
		return projectdate;
	}

	public void setProjectdate(Date projectdate) {
		this.projectdate = projectdate;
	}

	public String getProjectdesc() {
		return projectdesc;
	}

	public void setProjectdesc(String projectdesc) {
		this.projectdesc = projectdesc;
	}

	public Studproject() {

		// TODO Auto-generated constructor stub
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usr_id_fk")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
