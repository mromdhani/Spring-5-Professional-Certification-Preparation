package be.businesstraining.managedbeans;

import be.businesstraining.springbeans.IUserBusiness;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "userManagedBean")
@RequestScoped
// this is the default scope
public class UserManagedBean {

	@ManagedProperty(value = "#{userBo}")
	// Annotation driven injection
	private IUserBusiness userBo; // Injected From Spring grace au ELResolver !
	private String message;

	public String getMessage() {
		message = userBo.getMessage();
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public IUserBusiness getUserBo() {
		return userBo;
	}

	public void setUserBo(IUserBusiness userBo) {
		this.userBo = userBo;
	}

	public String getMsgFromSpring() {
		return userBo.getMessage();
	}

}
