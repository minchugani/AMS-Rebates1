package com.walmart.rebates.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SecondaryTables({@SecondaryTable(name = "Agr_item", pkJoinColumns=@PrimaryKeyJoinColumn(name="AgrNum")),
	@SecondaryTable(name = "Agr_Stores", pkJoinColumns=@PrimaryKeyJoinColumn(name="AgrNum")),
@SecondaryTable(name = "Agr_Vendors", pkJoinColumns=@PrimaryKeyJoinColumn(name="AgrNum")),
@SecondaryTable(name = "Agr_Tiers", pkJoinColumns=@PrimaryKeyJoinColumn(name="AgrNum"))

})
public class AgreementMaster {
@Id @GeneratedValue
private int AgrNum ;
@Column(name = "\"AgreementType\"")
private String agrType;

@Column(name = "\"ValidFrom\"")
@Temporal(TemporalType.DATE)
private Date validFrom;

@Column(name = "\"ValidTo\"")
@Temporal(TemporalType.DATE)
private Date validTo;

@Column(name = "\"AgreementDesc\"")
private String agrDesc;

@Column(name = "\"Country\"")
private String country;

@Column(name = "\"SettlPartner\"")
private String settlPartner;

@Column(name = "\"SettlCalender\"")
private String settlCalender;

@Column(name = "\"SettlCurrency\"")
private String settlCurrency;

@Column(name = "\"CalcBasis\"")
private String calcBasis;

@Column(name = "\"PaymentTerms\"")
private String paymentTerms;

@Column(name = "\"ItemNumber\"" , table = "Agr_item" ) 
private  String ItemNumber ;

@Column(name = "\"Department\"" , table = "Agr_item" ) 
private  String Department ;

@Column(name = "\"Storeid\"" , table = "Agr_Stores" ) 
private  int Storeid ;

@Column(name = "\"VendorNum\"" , table = "Agr_Vendors" ) 
private  int VendorNum ;

@Column(name = "\"TierSeq\"" , table = "Agr_Tiers" ) 
private  int TierSeq ;

@Column(name = "\"FromVal\"" , table = "Agr_Tiers" ) 
private  int FromVal;

@Column(name = "\"ToVal\"" , table = "Agr_Tiers" ) 
private  int ToVal;

@Column(name = "\"Rate\"" , table = "Agr_Tiers" ) 
private  int Rate;


public int getAgrNum() {
	return AgrNum;
}

public void setAgrNum(int agrNum) {
	AgrNum = agrNum;
}

public String getItemNumber() {
	return ItemNumber;
}

public void setItemNumber(String itemNumber) {
	ItemNumber = itemNumber;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public int getStoreid() {
	return Storeid;
}

public void setStoreid(int storeid) {
	Storeid = storeid;
}

public int getVendorNum() {
	return VendorNum;
}

public void setVendorNum(int vendorNum) {
	VendorNum = vendorNum;
}

public int getTierSeq() {
	return TierSeq;
}

public void setTierSeq(int tierSeq) {
	TierSeq = tierSeq;
}

public int getFromVal() {
	return FromVal;
}

public void setFromVal(int fromVal) {
	FromVal = fromVal;
}

public int getToVal() {
	return ToVal;
}

public void setToVal(int toVal) {
	ToVal = toVal;
}

public int getRate() {
	return Rate;
}

public void setRate(int rate) {
	Rate = rate;
}

public String getAgrType() {
	return agrType;
}

public void setAgrType(String agrType) {
	this.agrType = agrType;
}

public Date getValidFrom() {
	return validFrom;
}

public void setValidFrom(Date validFrom) {
	this.validFrom = validFrom;
}

public Date getValidTo() {
	return validTo;
}

public void setValidTo(Date validTo) {
	this.validTo = validTo;
}

public String getAgrDesc() {
	return agrDesc;
}

public void setAgrDesc(String agrDesc) {
	this.agrDesc = agrDesc;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getSettlPartner() {
	return settlPartner;
}

public void setSettlPartner(String settlPartner) {
	this.settlPartner = settlPartner;
}

public String getSettlCalender() {
	return settlCalender;
}

public void setSettlCalender(String settlCalender) {
	this.settlCalender = settlCalender;
}

public String getSettlCurrency() {
	return settlCurrency;
}

public void setSettlCurrency(String settlCurrency) {
	this.settlCurrency = settlCurrency;
}

public String getCalcBasis() {
	return calcBasis;
}

public void setCalcBasis(String calcBasis) {
	this.calcBasis = calcBasis;
}

public String getPaymentTerms() {
	return paymentTerms;
}

public void setPaymentTerms(String paymentTerms) {
	this.paymentTerms = paymentTerms;
}




}
