package springboot.resource;

import java.io.Serializable;

public class UserValidCheckResource implements Serializable {	
	
	private static final long serialVersionUID = -493600399465933105L;
	
	private Integer userId;	
	private String userName;
	private String role;
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserValidCheckResource [userId=" + userId + ", userName=" + userName + ", role=" + role + "]";
	}
}
