package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class TestListInterface {
public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		//Collections.reverse(a);
		System.out.println(a);
		System.out.println(a.subList(1, 3));
		
		LinkedList l = new LinkedList<>();
		l.add(22);
		l.add(22);
		l.add(22);
		l.add(22);
		l.add(22);
		System.out.println(l);
		
		Vector v = new Vector<>();
		v.add(212);
		v.add(122);
		v.add(322);
		v.add(422);
		System.out.println(v);
}
}