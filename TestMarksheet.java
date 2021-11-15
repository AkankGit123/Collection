package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		m1.rollNo = "1";
		m1.fname = "Ajay";
		m1.lname = "Sharma";
		m1.phy = 59;
		m1.che = 77;
		m1.mat = 89;
	
		Marksheet m2 = new Marksheet();
		m2.rollNo = "3";
		m2.fname = "Cjay";
		m2.lname = "Dinanath";
		m2.phy = 88;
		m2.che = 99;
		m2.mat = 87;
		
		Marksheet m3 = new Marksheet();
		m3.rollNo = "2";
		m3.fname = "Vijay";
		m3.lname = "Varma";
		m3.phy = 88;
		m3.che = 98;
		m3.mat = 87;
		
		Marksheet m4 = new Marksheet();
		m4.rollNo = "4";
		m4.fname = "Manoj";
		m4.lname = "Jain";
		m4.phy = 68;
		m4.che = 69;
		m4.mat = 67;
		
		ArrayList a = new ArrayList ();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		//Collections.sort(a); // sorting by roolnumber
		Collections.sort(a, new OrderByName()); // sort by fname
		//Collections.sort(a, new OrderByLname()); //sort by lname
		//Collections.sort(a, new OrderByChe()); //sort by che marks
		Iterator<Marksheet> it = a.iterator();
		while (it.hasNext()) {
			Marksheet o = (Marksheet) it.next();
			System.out.println(o.getRollNo()+" "+o.getFname()+" "+o.getLname()+" "+o.getPhy()+" "+o.getChe()+" "+o.getMat());
		}
	}

}
