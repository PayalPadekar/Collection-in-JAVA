package com.JavaColection;

import java.util.ArrayList;
import java.util.Collection;

public class B {
	public static void main(String[] args) {
		Collection listofNums = new ArrayList();
		
		System.out.println("Init size : "+ listofNums.size());
		
		listofNums.add(11);
		listofNums.add("Java");
		listofNums.add(7.7);
		listofNums.add(true);
		
		System.out.println("insertion size : "+ listofNums.size());
		
		listofNums.remove("Java");
		System.out.println("Deletion Size : "+listofNums.size());
		System.out.println(listofNums);
		
	}
}
