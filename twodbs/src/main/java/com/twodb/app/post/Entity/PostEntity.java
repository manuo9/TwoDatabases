package com.twodb.app.post.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class PostEntity {
	
	@Id
	@Column(columnDefinition = "BIGINT")
    private Long id;
	
	@Column(name = "first_name", length = 255)
    private String firstname;
	
	@Column(name = "last_name", length = 255)
    private String lastname;
	
    private String email;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public PostEntity() {
		super();
	}
	

    
    
}
