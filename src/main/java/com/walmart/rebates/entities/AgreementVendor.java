package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "\"Agreement_Vendor\"")
@IdClass(AgrVenKeys.class)
public class AgreementVendor implements Serializable {
	@Id 
//	@GeneratedValue
	@Column(name = "\"AgreementNum\"")
	private int agrNum;
	
    @Id
	@Column(name = "\"VendorNumber\"")
	private String vendorNumber;
	
	/*@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"AgreementNum\"" , referencedColumnName = "\"AgreementNum\"", insertable = false, updatable = false)
	private AgreementHeader  agrHeader ;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"VendorNumber\"" , referencedColumnName = "\"VendorNumber\"", insertable = false, updatable = false)
	private VendorMaster vendor;*/
	


	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	

	/*public AgreementHeader getAgrHeader() {
		return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
		this.agrHeader = agrHeader;
	}

	public VendorMaster getVendor() {
		return vendor;
	}

	public void setVendor(VendorMaster vendor) {
		this.vendor = vendor;
	}*/
	
	
}
