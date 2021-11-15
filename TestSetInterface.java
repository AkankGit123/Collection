package com.rays.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSetInterface {
	public static void main(String[] args) {

	
	HashSet h = new HashSet<>();
	h.add(1);
	h.add(21);
	h.add(31);
	h.add(41);
	h.add(51);
	
	System.out.println(h); // print set in any random order
	
	TreeSet t = new TreeSet<>();
	t.add(93);
	t.add(3);
	t.add(2);
	t.add(11);
	System.out.println(t); // ascending order
	
	
	LinkedHashSet lh = new LinkedHashSet();
	lh.add("343");
	lh.add("243");
	lh.add("143");
	lh.add("443");
	lh.add("543");
	
	
	System.out.println(lh);  // insertion order
	
	
	}
}
