package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(98);
		l.add(45);
		l.add(34);
		
		Collections.sort(l);  // sort in natural ascending order
		System.out.println(l);
		
	}

}
