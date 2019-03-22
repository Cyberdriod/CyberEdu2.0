package cyberdroid.jobportal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listedjob")
public class Listedjob {

	private int jobid;
	private String jtitle;
	private String cname;
	private int vaccancies;
	private String jdesc;
	private String hprocess;
	private String skill;
	private String jlocation;
	private int criteria;
	private String qualification;
	private String experience;
	private int salary;
	private int bond;
	private String venue;
	private Date interviewdate;
	private Date dtapply;
	private Date ndocument;
	private String contact;

	public Listedjob() {

		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name = "id")

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJtitle() {
		return jtitle;
	}

	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getVaccancies() {
		return vaccancies;
	}

	public void setVaccancies(int vaccancies) {
		this.vaccancies = vaccancies;
	}

	public String getJdesc() {
		return jdesc;
	}

	public void setJdesc(String jdesc) {
		this.jdesc = jdesc;
	}

	public String getHprocess() {
		return hprocess;
	}

	public void setHprocess(String hprocess) {
		this.hprocess = hprocess;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getJlocation() {
		return jlocation;
	}

	public void setJlocation(String jlocation) {
		this.jlocation = jlocation;
	}

	public int getCriteria() {
		return criteria;
	}

	public void setCriteria(int criteria) {
		this.criteria = criteria;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBond() {
		return bond;
	}

	public void setBond(int bond) {
		this.bond = bond;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Date getInterviewdate() {
		return interviewdate;
	}

	public void setInterviewdate(Date interviewdate) {
		this.interviewdate = interviewdate;
	}

	public Date getDtapply() {
		return dtapply;
	}

	public void setDtapply(Date dtapply) {
		this.dtapply = dtapply;
	}

	public Date getNdocument() {
		return ndocument;
	}

	public void setNdocument(Date ndocument) {
		this.ndocument = ndocument;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
