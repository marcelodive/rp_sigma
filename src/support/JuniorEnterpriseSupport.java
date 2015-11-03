package support;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.dao.JuniorEnterpriseDAO;
import model.entities.JuniorEnterprise;

@ManagedBean
public class JuniorEnterpriseSupport {
	
	private List<JuniorEnterprise> juniorEnterprises;
	private boolean emptyList = true;

	public List<JuniorEnterprise> getJuniorEnterprises() {	
		
		JuniorEnterpriseDAO juniorEnterpriseDAO = new JuniorEnterpriseDAO();		
		juniorEnterprises = juniorEnterpriseDAO.returnAllJEs();
		
		return juniorEnterprises;
	}

	public void setJuniorEnterprises(ArrayList<JuniorEnterprise> juniorEnterprises) {
		this.juniorEnterprises = juniorEnterprises;
	}
}
