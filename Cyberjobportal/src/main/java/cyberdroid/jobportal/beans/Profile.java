package cyberdroid.jobportal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studregistration")
public class Profile {

	@Id
	@GeneratedValue
	@Column(name="userid")
	private Integer userid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pin")
	private String pin;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="email")
	private String email;
	
	@Column(name="primarymobileno")
	private String primarymobileno;
	
	@Column(name="secondarymobileno")
	private String secondarymobileno;
	
	@Column(name="password")
	private String password;
	
	@Column(name="retypepassword")
	private String retypepassword;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(Integer userid, String firstname, String middlename, String lastname, String address, String pin,
			String country, String state, String city, String email, String primarymobileno, String secondarymobileno,
			String password, String retypepassword) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address = address;
		this.pin = pin;
		this.country = country;
		this.state = state;
		this.city = city;
		this.email = email;
		this.primarymobileno = primarymobileno;
		this.secondarymobileno = secondarymobileno;
		this.password = password;
		this.retypepassword = retypepassword;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimarymobileno() {
		return primarymobileno;
	}

	public void setPrimarymobileno(String primarymobileno) {
		this.primarymobileno = primarymobileno;
	}

	public String getSecondarymobileno() {
		return secondarymobileno;
	}

	public void setSecondarymobileno(String secondarymobileno) {
		this.secondarymobileno = secondarymobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetypepassword() {
		return retypepassword;
	}

	public void setRetypepassword(String retypepassword) {
		this.retypepassword = retypepassword;
	}

}
