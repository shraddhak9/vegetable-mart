package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Column(unique = true,nullable = false,name= "email_id")
	private String emailId;
       
    @Column(nullable = false)
	private String password;

	@Column(length = 20,nullable = false,name = "first_name")
	private String firstName;
	@Column(length = 20,nullable = false,name = "last_name")
	private String lastName;
	@Column(length = 13,nullable = false)
	private String phone;
	
	@Column(name ="is_deleted")
	private boolean isDeleted;
	
	
	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailid) {
		this.emailId = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phno) {
		this.phone = phno;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	

}
