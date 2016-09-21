package edu.srini.design.lamda;

import java.util.*;
import java.util.function.Predicate;

public class StrategyPattern {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(totalValues(list, e -> true));
		System.out.println(totalValues(list, e -> e % 2 == 0));
		System.out.println(totalValues(list, e -> e % 2 != 0));
	}

	private static Integer totalValues(List<Integer> list, Predicate<Integer> selector) {
		int result = 0;
	
		for (int i : list){
			if(selector.test(i)){
				result += i;
			}
		}
		return result;
	}
	
	//<Collection>.removeIf(filter);
	
}

 ////Interface interface Add public int add(int []);   // Impl1 -- Add Even number  public int add(int[]){  for (int i) { i % 2 == 0 resul ?+ i; } }      //Using class  Add a = new EvenAdd(); a.add(int[]i); 