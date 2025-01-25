package com.JavaColection;

import java.util.ArrayList;
import java.util.List;

public class C {

		public static void main(String[] args) {
			List <Integer> listofNums = new ArrayList<Integer>();
			
			System.out.println("Init size : "+ listofNums.size());
			
			listofNums.add(11);
			listofNums.add(22);
			listofNums.add(33);
			listofNums.add(44);
			
			for (Integer t : listofNums) {
				if(t.intValue()%2==0)
			System.out.println(t);
			
	       }
	   }
	}

