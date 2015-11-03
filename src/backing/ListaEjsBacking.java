package backing;

import javax.faces.bean.ManagedBean;

import controller.JuniorEnterpriseController;
import model.entities.JuniorEnterprise;

@ManagedBean
public class ListaEjsBacking {
	public void deleteEj(JuniorEnterprise juniorEnterprise){
		JuniorEnterpriseController juniorEnterpriseController = new JuniorEnterpriseController();
		juniorEnterpriseController.deleteJE(juniorEnterprise);
	}
}
