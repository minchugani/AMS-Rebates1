//package com.walmart.rebates.entities;
//import java.io.Serializable;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table
//@IdClass(VendorItemKeys.class)
//public class VendorItems implements Serializable{
//	@Id
//	@ManyToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name = "\"VendorNumber\"" , referencedColumnName = "\"VendorNumber\"", insertable = false, updatable = false)
//	private VendorMaster vendor;
//	@ManyToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name = "\"ItemNumber\"" , referencedColumnName = "\"ItemNumber\"", insertable = false, updatable = false)
//	private ItemMaster itemMaster;
//	@Column(name = "\"VendorNumber\"")
//	private String vendorNumber;
//	@Id
//	@Column(name = "\"ItemNumber\"")
//	private String itemNumber ;
//	public String getVendorNumber() {
//	return vendorNumber;
//	}
//	public void setVendorNumber(String vendorNumber) {
//	this.vendorNumber = vendorNumber;
//	}
//	public String getItemNumber() {
//	return itemNumber;
//	}
//	public void setItemNumber(String itemNumber) {
//	this.itemNumber = itemNumber;
//	}
//	public VendorMaster getVendor() {
//	return vendor;
//	}
//	public void setVendor(VendorMaster vendor) {
//	this.vendor = vendor;
//	}
//	public ItemMaster getItemMaster() {
//	return itemMaster;
//	}
//	public void setItemMaster(ItemMaster itemMaster) {
//	this.itemMaster = itemMaster;
//	}
//
//
//
//
//}