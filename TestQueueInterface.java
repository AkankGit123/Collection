package com.rays.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueInterface {
	public static void main(String[] args) {

	
	Queue q = new LinkedList();
	q.add(2.3);
	q.add(222);
	q.add(42.03);
	q.add(21.36);
	q.add("Rays");
	
	System.out.println(q);		
	System.out.println(q.contains(222));
	
	Queue p = new PriorityQueue();
	p.add("Ram");
	p.add("Shyam");
	p.add("Sita");
	p.add("Gita");
	p.add("Ajay");
	
	System.out.println(p);

}}
