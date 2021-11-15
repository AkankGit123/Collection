package com.rays.Collection;

import java.util.ArrayList;
import java.util.List;

public class EqualsHashCode {
	public static void main(String[] args) {
		
		String str = "Java";
		String str1 = "java";
		System.out.println(str.equals(str1));
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		}
}
