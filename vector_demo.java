package com.JavaColection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class vector_demo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List <Integer>nums = new ArrayList<Integer>();
			
			nums.add(11);
			nums.add(22);
			nums.add(33);
			nums.add(44);
			System.out.println("1. ToString()");
			System.out.println(nums);
			
			System.out.println("\n2. for( ; ; ; )");
			for(int i = 0; i < nums.size(); i++) {
				System.out.println(nums.get(i));
			}
			
			System.out.println("\n3. Iterators()");
			Iterator<Integer> itr = nums.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("\n4. List_Iterators()");
			ListIterator<Integer>lstitr = nums.listIterator();
			while(lstitr.hasNext()) {
				System.out.println(lstitr.next());
			}
			
			System.out.println("\n5. Enhance For Loop()");
			for(Integer t : nums) {
				System.out.println(t);
			}
			
			System.out.println("\n6. forEach( :: )");
			nums.forEach(System.out::println);
		}

	}

