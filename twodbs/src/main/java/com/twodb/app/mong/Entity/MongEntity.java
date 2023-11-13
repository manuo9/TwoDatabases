package com.twodb.app.mong.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class MongEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentid;
	
	@Column(name = "departmentname" )
    private String departmentname;
    
    

	public MongEntity(Long departmentid, String departmentname) {
		
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public MongEntity() {
		super();		
	}
	 
    
}
