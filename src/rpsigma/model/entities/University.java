package rpsigma.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the universities database table.
 * 
 */
@Entity
@Table(name="universities")
@NamedQuery(name="University.findAll", query="SELECT u FROM University u")
public class University implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-one association to JuniorEnterprise
	@OneToMany(mappedBy="university")
	private List<JuniorEnterprise> juniorEnterprises;

	public University() {
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

	public List<JuniorEnterprise> getJuniorEnterprises() {
		return this.juniorEnterprises;
	}

	public void setJuniorEnterprises(List<JuniorEnterprise> juniorEnterprises) {
		this.juniorEnterprises = juniorEnterprises;
	}

	public JuniorEnterprise addJuniorEnterprise(JuniorEnterprise juniorEnterprise) {
		getJuniorEnterprises().add(juniorEnterprise);
		juniorEnterprise.setUniversity(this);

		return juniorEnterprise;
	}

	public JuniorEnterprise removeJuniorEnterprise(JuniorEnterprise juniorEnterprise) {
		getJuniorEnterprises().remove(juniorEnterprise);
		juniorEnterprise.setUniversity(null);

		return juniorEnterprise;
	}

}