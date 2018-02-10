package usersService.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Users" database table.
 * 
 */
@Entity
@Table(name="\"Users\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERS_USERNO_GENERATOR", sequenceName="USERSSEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_USERNO_GENERATOR")
	@Column(name="\"UserNo\"")
	private Integer userNo;

	@Column(name="\"Description\"")
	private String description;

	@Column(name="\"HouseGroupID\"")
	private Integer houseGroupID;

	@Column(name="\"Password\"")
	private String password;

	@Column(name="\"Role\"")
	private Integer role;

	@Column(name="\"UserName\"")
	private String userName;

	public User() {
	}

	public Integer getUserNo() {
		return this.userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getHouseGroupID() {
		return this.houseGroupID;
	}

	public void setHouseGroupID(Integer houseGroupID) {
		this.houseGroupID = houseGroupID;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString() {
		StringBuilder userString = new StringBuilder();
		return userString.append("שם: ").append(this.getUserName()).
		append("\n משפחה: ").append(this.getHouseGroupID()).
		append("\n תפקיד: ").append(this.getRole()).toString();
	}

}