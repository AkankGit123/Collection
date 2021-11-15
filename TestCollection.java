package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("bura mat dekho");
		c.add("bura mat suno");
		c.add("bura mat kaho");
		
		System.out.println("Length of collection c is :" +c.size());
		/*
		 * for (Object o : c) { System.out.println(o); } // to print object line by line
		 */
		System.out.println(c); // to print object in one line only
		
		Object[] arr =c.toArray(); 
		for (Object o : arr) {
			String s = (String) o;
			System.out.println(s);
		} // type cast object to string

		
		
		List li = new ArrayList();
		li.add(1);
		li.add(1.5);
		
		li.add(1.5);
		li.add("Ram");
		li.add('a');
		li.add(353);
		
		
		
		List lis = new ArrayList();

		lis.add(31.5);
		
		lis.add(31.5);
		lis.add("shyam");
		lis.add('m');
		lis.add(453);
		
		lis.addAll(li);
		
		//lis.clear();
		//lis.contains(23);
		//lis.remove(31.5);
	//	lis.removeAll(li);
	//System.out.println(lis);

		lis.retainAll(li);
		System.out.println(lis);
	
	}

}
