package cyberdroid.jobportal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listedjob")
public class Admpostedjob {
private int jobid;
private String jtitle;
private String cname;
private String vaccancies;
private String jdesc;
private String experience;


private String hprocess;
private String skill;
private String jlocation;
private String criteria;
private String qualification;
private String salary;
private String bond;
private String venue;
private String interviewDate;
private String dtapply;
private String ndocument;
private String contact;
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
public String getVaccancies() {
	return vaccancies;
}
public void setVaccancies(String vaccancies) {
	this.vaccancies = vaccancies;
}
public String getJdesc() {
	return jdesc;
}
public void setJdesc(String jdesc) {
	this.jdesc = jdesc;
	
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
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
public String getCriteria() {
	return criteria;
}
public void setCriteria(String criteria) {
	this.criteria = criteria;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getBond() {
	return bond;
}
public void setBond(String bond) {
	this.bond = bond;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public String getInterviewDate() {
	return interviewDate;
}
public void setInterviewDate(String interviewDate) {
	this.interviewDate = interviewDate;
}
public String getDtapply() {
	return dtapply;
}
public void setDtapply(String dtapply) {
	this.dtapply = dtapply;
}
public String getNdocument() {
	return ndocument;
}
public void setNdocument(String ndocument) {
	this.ndocument = ndocument;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Admpostedjob() {

	// TODO Auto-generated constructor stub
}


}
