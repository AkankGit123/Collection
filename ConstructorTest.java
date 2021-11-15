package com.rays.Collection;

public class ConstructorTest {
	
	int a;
	int b;
	
	public ConstructorTest(int b) {
		System.out.println("This is 1 para Constructor");
	}
	
	public static void main(String[] args) {
		ConstructorTest T = new ConstructorTest(5);
		System.out.println(T.b);
	}
}
