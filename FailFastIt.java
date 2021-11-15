package com.rays.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailFastIt {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Ajaay");
		a.add("Vijay");
		
		Iterator it= a.iterator();
		//a.add("Dinath");
		while (it.hasNext()) {
			Object o = (Object) it.next();
		System.out.println(o);	
		}
		
		
		
		Vector v = new Vector();
		v.add(12);
		v.add(34);
		v.add(98);
		v.add(8);
		v.add(7);
		
		Enumeration en = v.elements();
		
		v.add(3);
		while (en.hasMoreElements()) {
			Object o = (Object) en.nextElement();
			System.out.println(o);
		}
		
		
	}

}
