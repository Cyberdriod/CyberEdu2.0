package cyberdroid.jobportal.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studeducational")
public class Education {
	

	private int eduid;
//	private Profile profile;
	private String highesteducation;
	private String university;
	private String passingyear;
	private String grade;
	private int userid;
	public Education() {
		
	}



	@Id
	@GeneratedValue
	@Column(name="eduid")
	public int getEduid() {
		return eduid;
	}

	public void setEduid(int eduid) {
		this.eduid = eduid;
	}

	

	public String getHighesteducation() {
		return highesteducation;
	}

	public void setHighesteducation(String highesteducation) {
		this.highesteducation = highesteducation;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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
	
	
}
