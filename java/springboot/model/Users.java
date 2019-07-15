package springboot.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "user")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_status")
	private boolean status;
	
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
	List<RoleEntity> role;
		
	@Column(name="registered_date")
	private Date registeredDate;
	
	@Column(name="admin_id")
	private Integer adminId;
	
//	@ManyToOne
//	@JoinColumn(name="admin_id")
//	@JsonBackReference	
//	private Users users;

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}	

	public List<RoleEntity> getRole() {
		return role;
	}

	public void setRole(List<RoleEntity> role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", status=" + status
				+" registeredDate=" + registeredDate + ", adminId=" + adminId + "]";
	}
	
}
