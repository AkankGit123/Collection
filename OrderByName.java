package com.rays.Collection;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.fname.compareTo(o2.fname);
	}

	
	/*public int compare(Marksheet o1, Marksheet o2) {
		if(o1.fname.equals(o2.fname)) {
		return o1.lname.compareTo(o2.lname);
		}
		else {
			return o1.fname.compareTo(o2.fname);
		}
}*/ // Compare last name when fname is same
	

}
