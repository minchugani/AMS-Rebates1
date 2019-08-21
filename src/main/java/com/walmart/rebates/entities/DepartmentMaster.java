package com.walmart.rebates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"DepartmentMaster\"")
public class DepartmentMaster {
	@Id
	@Column(name = "\"Department\"")
	private String department;
	
	@Column(name = "\"DepartDesc\"")
	private String departmentdesc;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartmentdesc() {
		return departmentdesc;
	}

	public void setDepartmentdesc(String departmentdesc) {
		this.departmentdesc = departmentdesc;
	}
	
	
}
