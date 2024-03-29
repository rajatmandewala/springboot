package springboot.resource;

import java.io.Serializable;

public class UserResource  implements Serializable {
		
	private static final long serialVersionUID = -1607894481392366816L;
	private Integer userId;
	private String userName;
	private String password;	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	@Override
	public String toString() {
		return "UserResource [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
}
