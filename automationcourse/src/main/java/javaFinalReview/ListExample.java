package javaFinalReview;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("green");
		colors.add("white");
		colors.add("Black");
		
		System.out.println("Colors:" +colors);
		
		System.out.println();
		
		System.out.println("Iterating using for each loop..");
		for(String colour : colors) {
			System.out.println(colour);
		}
		
		

	}

}
