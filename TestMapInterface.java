package com.rays.Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestMapInterface {
public static void main(String[] args) {
		
		HashMap m = new HashMap();
		m.put(1, "Ajay");
		m.put(2, "Binod");
		m.put(3, "Chetan");
		m.put(4, "Damodar");
		m.put(5, "Ram");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());

		Hashtable m1 = new Hashtable();
		m1.put(1, "Ajay");
		m1.put(2, "Binod");
		m1.put(3, "Chetan");
		m1.put(4, "Damodar");
		m1.put(5, "Ram");
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());

}}
