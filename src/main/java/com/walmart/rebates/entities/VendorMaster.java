package com.walmart.rebates.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"VendorMaster\"")
public class VendorMaster implements Serializable {
	@Id
	@Column(name = "\"VendorNumber\"")
	private String vendorNumber;
	@Column(name = "\"VendorDescription\"")
	private String vendorDescription;
	public String getVendorNumber() {
	return vendorNumber;
	}
	public void setVendorNumber(String vendorNumber) {
	this.vendorNumber = vendorNumber;
	}
	public String getVendorDescription() {
	return vendorDescription;
	}
	public void setVendorDescription(String vendorDescription) {
	this.vendorDescription = vendorDescription;
	}


}