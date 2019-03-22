package cyberdroid.jobportal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studexperience")
public class Experience {

	private int expid;
	private int userid;
	private String jobtitle;
	private String companyname;
	private String companydomain;
	private String yearofexperience;
	private String ctcofcurrentcompany;
	private String joiningdate;
	private String technology;
	private String project;
	private String skill;
	
	@Id
	@GeneratedValue
	@Column(name="expid")
	public int getExpid() {
		return expid;
	}
	public void setExpid(int expid) {
		this.expid = expid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
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
	public String getCtcofcurrentcompany() {
		return ctcofcurrentcompany;
	}
	public void setCtcofcurrentcompany(String ctcofcurrentcompany) {
		this.ctcofcurrentcompany = ctcofcurrentcompany;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
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
	
	public Experience() {
		
	}
	
	
	
	
}
