package com.rays.Collection;

import java.util.Comparator;

public class OrderByLname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.lname.compareTo(o2.lname);
	}
	
	

}
