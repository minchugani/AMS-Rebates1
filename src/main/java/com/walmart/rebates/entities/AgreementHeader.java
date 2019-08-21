package com.walmart.rebates.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "\"AgreementHeader\"")
//@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class AgreementHeader implements Serializable {
	
	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
// @SequenceGenerator(name="book_generator", sequenceName = "book_seq", allocationSize=50)
  //  @GeneratedValue
	
	@Column(name = "\"AgreementNum\"")
	private int agrNum;

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

	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name = "\"AgreementNum\"", referencedColumnName = "\"AgreementNum\"" , insertable = false , updatable = false)
	private Collection<AgreementItems> agritmdtl;

	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name = "\"AgreementNum\"", referencedColumnName = "\"AgreementNum\"" , insertable = false , updatable = false)
	private Collection<AgreementStores> agrstrdtl;

	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name = "\"AgreementNum\"", referencedColumnName = "\"AgreementNum\"" , insertable = false , updatable = false)
	private Collection<AgreementVendor> agrvendtl ;
	
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name = "\"AgreementNum\"", referencedColumnName = "\"AgreementNum\"" , insertable = false , updatable = false)
	private Collection<AgreementTiers> agrtiers ;
	public AgreementHeader() {
		this.agritmdtl = new ArrayList<AgreementItems>();
		this.agrstrdtl = new ArrayList<AgreementStores>();
		this.agrvendtl = new ArrayList<AgreementVendor>();
		this.agrtiers =  new ArrayList<AgreementTiers>();
	}

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
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

	public Collection<AgreementItems> getAgritmdtl() {
		return agritmdtl;
	}

	public void setAgritmdtl(Collection<AgreementItems> agritmdtl) {
		this.agritmdtl = agritmdtl;
	}

	public Collection<AgreementStores> getAgrstrdtl() {
		return agrstrdtl;
	}

	public void setAgrstrdtl(Collection<AgreementStores> agrstrdtl) {
		this.agrstrdtl = agrstrdtl;
	}

	public Collection<AgreementVendor> getAgrvendtl() {
		return agrvendtl;
	}

	public void setAgrvendtl(Collection<AgreementVendor> agrvendtl) {
		this.agrvendtl = agrvendtl;
	}

	public Collection<AgreementTiers> getAgrtiers() {
		return agrtiers;
	}

	public void setAgrtiers(Collection<AgreementTiers> agrtiers) {
		this.agrtiers = agrtiers;
	}

}