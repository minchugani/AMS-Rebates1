package com.walmart.rebates.entities;

import java.io.Serializable;

public class AgrTiersKeys implements Serializable{

	//private int agrNum;
	private int tierSequence;

	public int getTierSequence() {
		return tierSequence;
	}

	public void setTierSequence(int tierSequence) {
		this.tierSequence = tierSequence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tierSequence;
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
		AgrTiersKeys other = (AgrTiersKeys) obj;
		if (tierSequence != other.tierSequence)
			return false;
		return true;
	}

	

	
	
	

}