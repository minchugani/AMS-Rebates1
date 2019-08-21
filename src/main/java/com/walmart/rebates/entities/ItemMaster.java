//package com.walmart.rebates.entities;
//
//import java.io.Serializable;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//
//@Entity
//@Table(name = "\"ItemMaster\"")
//public class ItemMaster implements Serializable{
//	@Id
//	@Column(name = "\"ItemNumber\"")
//	private String itemNumber;
//	
//	@Column(name = "\"Department\"")
//	private String department;
//	
//	@Column(name = "\"DepartDesc\"")
//	private String departmentdesc;
//	@ManyToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name = "\"Department\"" , referencedColumnName = "\"Department\"", insertable = false, updatable = false)
//	private DepartmentMaster deptmaster ;
//	public String getItemNumber() {
//		return itemNumber;
//	}
//
//	public void setItemNumber(String itemNumber) {
//		this.itemNumber = itemNumber;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//
//	public String getDepartmentdesc() {
//		return departmentdesc;
//	}
//
//	public void setDepartmentdesc(String departmentdesc) {
//		this.departmentdesc = departmentdesc;
//	}
//
//	public DepartmentMaster getDeptmaster() {
//		return deptmaster;
//	}
//
//	public void setDeptmaster(DepartmentMaster deptmaster) {
//		this.deptmaster = deptmaster;
//	}
//	
//
//}
