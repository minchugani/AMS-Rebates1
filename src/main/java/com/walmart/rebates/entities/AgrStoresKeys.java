package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

public class AgrStoresKeys implements Serializable {
	
	private int storeID;
	@Column(name = "\"AgreementNum\"")
	private int agrNum;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agrNum;
		result = prime * result + storeID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgrStoresKeys other = (AgrStoresKeys) obj;
		if (agrNum != other.agrNum)
			return false;
		if (storeID != other.storeID)
			return false;
		return true;
	}
	
	
	
	
	
}
