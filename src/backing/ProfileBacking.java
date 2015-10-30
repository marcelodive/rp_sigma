package backing;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;

import controller.UserController;
import model.entities.User;

@ManagedBean
public class ProfileBacking {
	User user = new User();
	
	public void saveUser(){
		UserController userController = new UserController();
		Timestamp createdAt  = new Timestamp(Calendar.getInstance().getTime().getTime());		
		
		this.user.setAdministrator(false);
		this.user.setCreatedAt(createdAt);
		this.user.setActive(true);
		this.user.setUpdatedAt(createdAt);
		
		userController.saveUser(this.user);
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}



















