package com.akshay.kochiProject.Model;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="vender")
public class VenderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ve_id")
	private long id;
	
	@JoinColumn(name="addr_id")
	private Address addid;
	
	@JoinColumn(name="v_cat_id")
	private VendorCategory vencatid;
	
	@Column(name="ve_name")
	private String name;
	
	@Column(name="ve_password")
	private String password;
	
	@Column(name="ve_usertype")
	private String usertype;
	
	public VenderEntity() {
		
	}

	public VenderEntity(Address addid, VendorCategory vencatid, String name, String password, String usertype) {
		super();
		this.addid = addid;
		this.vencatid = vencatid;
		this.name = name;
		this.password = password;
		this.usertype = usertype;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddid() {
		return addid;
	}

	public void setAddid(Address addid) {
		this.addid = addid;
	}

	public VendorCategory getVencatid() {
		return vencatid;
	}

	public void setVencatid(VendorCategory vencatid) {
		this.vencatid = vencatid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	

}*/