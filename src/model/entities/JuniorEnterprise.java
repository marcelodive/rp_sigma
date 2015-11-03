package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the junior_enterprises database table.
 * 
 */
@Entity
@Table(name="junior_enterprises")
@NamedQuery(name="JuniorEnterpris.findAll", query="SELECT j FROM JuniorEnterprise j")
public class JuniorEnterprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String abbreviation;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	private String image;

	private String name;

	private String phone;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private String website;

	//bi-directional many-to-one association to City
	@ManyToOne
	private City city;

	//bi-directional many-to-one association to University
	@ManyToOne
	private University university;

	//bi-directional many-to-many association to Service
	@ManyToMany(mappedBy="juniorEnterprises")
	private List<Service> services;

	public JuniorEnterprise() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

}