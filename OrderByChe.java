package com.rays.Collection;

import java.util.Comparator;

public class OrderByChe implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getChe() - o2.getChe();
	}

}
