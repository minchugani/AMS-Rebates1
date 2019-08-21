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

@Table(name = "\"AgreementTiers\"")
@IdClass(AgrTiersKeys.class)
public class AgreementTiers implements Serializable{

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"AgreementNum\"")
	private int agrNum;

	@Id
	@Column(name = "\"TierSequence\"")
	private int tierSequence;

	@Column(name = "\"TierFrom\"")
	private int tierFrom;

	@Column(name = "\"TierTo\"")
	private int tierTo;

	@Column(name = "\"TierRate\"")
	private int tierRate;

/*	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"AgreementNum\"" , referencedColumnName = "\"AgreementNum\"", insertable = false, updatable = false)
	private AgreementHeader agrHeader;*/

	

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	public int getTierSequence() {
		return tierSequence;
	}

	public void setTierSequence(int tierSequence) {
		this.tierSequence = tierSequence;
	}

	public int getTierFrom() {
		return tierFrom;
	}

	public void setTierFrom(int tierFrom) {
		this.tierFrom = tierFrom;
	}

	public int getTierTo() {
		return tierTo;
	}

	public void setTierTo(int tierTo) {
		this.tierTo = tierTo;
	}

	public int getTierRate() {
		return tierRate;
	}

	public void setTierRate(int tierRate) {
		this.tierRate = tierRate;
	}

	

/*	public AgreementHeader getAgrHeader() {
	return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
	this.agrHeader = agrHeader;
	} */
}