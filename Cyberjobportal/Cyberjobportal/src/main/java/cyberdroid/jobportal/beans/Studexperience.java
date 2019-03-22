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
@Table(name = "Studexperience")
public class Studexperience {

	private int expid;
	private String jtitle;
	private String companyname;
	private String companydomain;
	private String yearofexperience;
	private String ctcofcurrentcomapny;
	private Date joiningdate;
	private String technology;
	private String project;
	private String skill;
	private Profile profile;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getExpid() {
		return expid;
	}

	public void setExpid(int expid) {
		this.expid = expid;
	}

	public String getJtitle() {
		return jtitle;
	}

	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanydomain() {
		return companydomain;
	}

	public void setCompanydomain(String companydomain) {
		this.companydomain = companydomain;
	}

	public String getYearofexperience() {
		return yearofexperience;
	}

	public void setYearofexperience(String yearofexperience) {
		this.yearofexperience = yearofexperience;
	}

	public String getCtcofcurrentcomapny() {
		return ctcofcurrentcomapny;
	}

	public void setCtcofcurrentcomapny(String ctcofcurrentcomapny) {
		this.ctcofcurrentcomapny = ctcofcurrentcomapny;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usr_id_fk")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Studexperience() {

	}

}
