package springboot.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity implements Serializable
{
	private static final long serialVersionUID = 5883810537150968945L;
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="role_id")
	Integer id;
	
	@Column(name="role_name")
	String role;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", role=" + role + "]";
	}
	
}