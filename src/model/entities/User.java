package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private boolean administrator;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	private String name;

	private String password;

	private String phone;
	
	@Column(nullable=true)
	private JuniorEnterprise je;

	@Column(name="remember_token", nullable=true)
	private String rememberToken;

	private boolean active;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public JuniorEnterprise getJe() {
		return je;
	}

	public void setJe(JuniorEnterprise je) {
		this.je = je;
	}

	public String getRememberToken() {
		return this.rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean status) {
		this.active = status;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}