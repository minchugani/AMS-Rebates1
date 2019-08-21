package com.walmart.rebates.entities;

import java.io.Serializable;

public class AgrVenKeys implements Serializable {
//	private int agrnum;
	private String vendorNumber;

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vendorNumber == null) ? 0 : vendorNumber.hashCode());
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
		AgrVenKeys other = (AgrVenKeys) obj;
		if (vendorNumber == null) {
			if (other.vendorNumber != null)
				return false;
		} else if (!vendorNumber.equals(other.vendorNumber))
			return false;
		return true;
	}
	
	
	
	
	

}
