package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
//@Embeddable
public class AgrItemKeys implements Serializable {
//	@GeneratedValue
	private String itemNumber;
	private String department;
	@Column(name = "\"AgreementNum\"")
	private int agrNum;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agrNum;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((itemNumber == null) ? 0 : itemNumber.hashCode());
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
		AgrItemKeys other = (AgrItemKeys) obj;
		if (agrNum != other.agrNum)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (itemNumber == null) {
			if (other.itemNumber != null)
				return false;
		} else if (!itemNumber.equals(other.itemNumber))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
