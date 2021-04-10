package org.apache.struts.loginstruts.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginModel {
	private String username;
	private String password;
	
	public LoginModel(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public LoginModel() {
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validateUser() {
		Connection conn = null;

        try {
           String URL = "jdbc:mysql://localhost/STRUTS_LOGIN";
           
           conn = DriverManager.getConnection(URL, "root", "password");
           String sql = "SELECT userNAME FROM LOGIN WHERE";
           
           sql+=" userNAME = ? AND password = ?";
           PreparedStatement ps = conn.prepareStatement(sql);
           
           ps.setString(1, this.getUsername());
           ps.setString(2, this.getPassword());
           
           ResultSet rs = ps.executeQuery();

           while (rs.next()) {
              return true;
           }
        } catch (Exception e) {
        	System.out.println(e);
           	return false;
        } finally {
           if (conn != null) {
              try {
                 conn.close();
              } catch (Exception e) {
            	  System.out.println(e);
              }
           }
        }
		return false;
	}
}