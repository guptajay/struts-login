package org.apache.struts.loginstruts.action;
import org.apache.struts.loginstruts.model.LoginModel;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {
   private static final long serialVersionUID = 1L;
   private String errorMessage;
   private LoginModel loginModel = new LoginModel();
    
    public String execute() {
        String ret = ERROR;
        boolean validateUser = loginModel.validateUser();

        if(!validateUser)
        	setErrorMessage("Unsuccessful Login, Please try again");
        else
         ret = SUCCESS;

        return ret;   
    }
    
    public LoginModel getLoginModel() {
        return this.loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
