package cyberdroid.jobportal.beans;

public class AdmStudent 
{
	private int studentid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String skill;
	private int yearofexperience;
	public AdmStudent() {
		
	}
	private String jobtitle;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getYearofexperience() {
		return yearofexperience;
	}
	public void setYearofexperience(int yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	
	

}
