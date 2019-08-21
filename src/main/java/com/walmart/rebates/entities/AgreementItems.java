package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "\"AgreementItems\"")
//@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
@IdClass(AgrItemKeys.class)
public class AgreementItems implements Serializable{
	//@EmbeddedId
	//AgrItemKeys agritemkeys ;

	/*public AgrItemKeys getAgritemkeys() {
		return agritemkeys;
	}

	public void setAgritemkeys(AgrItemKeys agritemkeys) {
		this.agritemkeys = agritemkeys;
	}*/
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name = "\"AgreementNum\"")
	private int agrNum;
	
	@Id
	@Column(name = "\"ItemNumber\"") 
	private String itemNumber;

	@Id
	@Column(name = "\"Department\"")
	private String department; 
	
//	@ManyToOne(cascade= CascadeType.ALL)
	//@JoinColumn(name = "\"AgreementNum\"" , referencedColumnName = "\"AgreementNum\"", insertable = false, updatable = false)
	
	/*private AgreementHeader agrHeader;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"Department\"" , referencedColumnName = "\"Department\"", insertable = false, updatable = false)
	private DepartmentMaster depmaster */;
	



	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

/*	public AgreementHeader getAgrHeader() {
		return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
		this.agrHeader = agrHeader;
	}*/

	/*public DepartmentMaster getDepmaster() {
		return depmaster;
	}

	public void setDepmaster(DepartmentMaster depmaster) {
		this.depmaster = depmaster;
	}*/ 
	

}
