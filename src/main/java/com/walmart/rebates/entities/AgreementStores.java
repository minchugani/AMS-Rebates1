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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "\"AgreementStores\"")
@IdClass(AgrStoresKeys.class)
//@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class AgreementStores implements Serializable {
/*	@EmbeddedId
	AgrStoresKeys agritemkeys ;

	public AgrStoresKeys getAgritemkeys() {
		return agritemkeys;
	}

	public void setAgritemkeys(AgrStoresKeys agritemkeys) {
		this.agritemkeys = agritemkeys;
	}*/
	
	
	
	//  @GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "\"AgreementNum\"")
	private int agrNum;
	
	@Id
	@Column(name = "\"StoreID\"")
	private int storeID;

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	
	
/*	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"StoreID\"" , referencedColumnName = "\"StoreID\"", insertable = false, updatable = false)
	private StoreMaster storemas ; */
/*	public AgreementHeader getAgrHeader() {
		return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
		this.agrHeader = agrHeader;
	}*/

	

	

	
	
	

}
