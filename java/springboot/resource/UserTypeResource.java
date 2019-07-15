package springboot.resource;

import java.io.Serializable;

public class UserTypeResource implements Serializable 
{	
	private static final long serialVersionUID = -6179154728867558888L;

	private Integer userId;
	private String userName;	
	
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
	
	@Override
	public String toString() {
		return "UserTypeResource [userId=" + userId + ", userName=" + userName + "]";
	}
}
