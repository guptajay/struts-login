package org.apache.struts.loginstruts.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.struts.loginstruts.model.LoginModel;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

   private static final long serialVersionUID = 1L;

   private String errorMessage;
    
    private LoginModel loginModel = new LoginModel();
    
    public String execute() {
    	
        String ret = ERROR;
        Connection conn = null;

        try {
           String URL = "jdbc:mysql://localhost/STRUTS_LOGIN";
           
           conn = DriverManager.getConnection(URL, "root", "password");
           String sql = "SELECT userNAME FROM LOGIN WHERE";
           
           sql+=" userNAME = ? AND password = ?";
           PreparedStatement ps = conn.prepareStatement(sql);
           
           ps.setString(1, loginModel.getUsername());
           ps.setString(2, loginModel.getPassword());
           
           ResultSet rs = ps.executeQuery();

           while (rs.next()) {
              ret = SUCCESS;
           }
        } catch (Exception e) {
        	System.out.println(e);
           ret = ERROR;
        } finally {
           if (conn != null) {
              try {
                 conn.close();
              } catch (Exception e) {
            	  System.out.println(e);
              }
           }
        }
        
        if(ret != SUCCESS)
        	setErrorMessage("Unsuccessful Login, Please try again");
        
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
