package controller;

import model.dao.JuniorEnterpriseDAO;
import model.entities.JuniorEnterprise;

public class JuniorEnterpriseController {
	
	public void deleteJE(JuniorEnterprise juniorEnterprise){
		JuniorEnterpriseDAO juniorEnterpriseDAO = new JuniorEnterpriseDAO();
		juniorEnterpriseDAO.deleteJE(juniorEnterprise);
		
	}
}
