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
@Table(name = "states")
public class State {
	private int id;
	private String name;
	private countries country;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usr_id_fk")
	public countries getProfile() {
		return country;
	}

	public void setProfile(countries country) {
		this.country = country;
	}

	public State() {

		// TODO Auto-generated constructor stub
	}

}
