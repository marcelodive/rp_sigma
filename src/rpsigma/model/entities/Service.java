package rpsigma.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the services database table.
 * 
 */
@Entity
@Table(name="services")
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-many association to JuniorEnterprise
	@ManyToMany
	@JoinTable(
		name="service_je"
		, joinColumns={
			@JoinColumn(name="service_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="je_id")
			}
		)
	private List<JuniorEnterprise> juniorEnterprises;

	//bi-directional many-to-one association to Field
	@ManyToOne
	private Field field;

	public Service() {
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

	public Field getField() {
		return this.field;
	}

	public void setField(Field field) {
		this.field = field;
	}

}