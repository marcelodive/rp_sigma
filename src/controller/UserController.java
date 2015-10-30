package controller;

import model.dao.UserDAO;
import model.entities.User;

public class UserController {
	UserDAO userDAO = new UserDAO();
	
	public void saveUser(User user){
		userDAO.saveUser(user);
	}
}
