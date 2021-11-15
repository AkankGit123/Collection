package com.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionUsingIterator {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Ball");
		a.add("Cat");
		a.add("Dog");
		a.add("Elephant");
		System.out.println(a);
		for (Object p : a) {
			System.out.println(p);
		}
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			String str = (String) it.next();
			if(str.equals("Ball")) {
				it.remove();
				System.out.println("Above element is delelted");
				break;
			}
			
		}
		System.out.println("Remaing element are");
		for (Object o : a) {
			System.out.println(o);
		}
		
	}
}
