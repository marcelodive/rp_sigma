package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cities database table.
 * 
 */
@Entity
@Table(name="cities")
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-one association to State
	@ManyToOne
	private State state;

	//bi-directional many-to-one association to JuniorEnterprise
	@OneToMany(mappedBy="city")
	private List<JuniorEnterprise> juniorEnterprises;

	public City() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<JuniorEnterprise> getJuniorEnterprises() {
		return this.juniorEnterprises;
	}

	public void setJuniorEnterprises(List<JuniorEnterprise> juniorEnterprises) {
		this.juniorEnterprises = juniorEnterprises;
	}

	public JuniorEnterprise addJuniorEnterpris(JuniorEnterprise juniorEnterprise) {
		getJuniorEnterprises().add(juniorEnterprise);
		juniorEnterprise.setCity(this);

		return juniorEnterprise;
	}

	public JuniorEnterprise removeJuniorEnterprise(JuniorEnterprise juniorEnterprise) {
		getJuniorEnterprises().remove(juniorEnterprise);
		juniorEnterprise.setCity(null);

		return juniorEnterprise;
	}

}