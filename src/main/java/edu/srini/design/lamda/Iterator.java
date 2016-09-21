package edu.srini.design.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		/*
		// External Iterators
		for(int i = 0 ; i < asList.size(); i++)
		{
			System.out.println(asList.get(i));
		}
		
		for(int i : asList)
		{
			System.out.println(i);
		}
		
		// Internal Iterators
		asList.forEach(e -> System.out.println(e));*/
		
		//asList.forEach(System.out::println);
		
		
		//ConcurrentModificationException
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
 
		for (String s : list) {
			if (s.equals("B")) {
				list.remove(s);
			    break;
			}
		}
		
		System.out.println(list);
	}

}
