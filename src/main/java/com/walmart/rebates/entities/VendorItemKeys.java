package com.walmart.rebates.entities;

import java.io.Serializable;

public class VendorItemKeys implements Serializable{

	private String vendorNumber;
	private String itemNumber;
	
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((itemNumber == null) ? 0 : itemNumber.hashCode());
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
	VendorItemKeys other = (VendorItemKeys) obj;
	if (itemNumber == null) {
	if (other.itemNumber != null)
	return false;
	} else if (!itemNumber.equals(other.itemNumber))
	return false;
	if (vendorNumber == null) {
	if (other.vendorNumber != null)
	return false;
	} else if (!vendorNumber.equals(other.vendorNumber))
	return false;
	return true;
	}

}