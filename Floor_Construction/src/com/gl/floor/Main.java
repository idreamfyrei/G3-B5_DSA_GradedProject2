package com.gl.floor;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Main {

	public static void main(String [] args) {
		
		Scanner flr = new Scanner(System.in);
		
		System.out.println("Enter the number of floors in the building");
		int floor = flr.nextInt();
		
		List<Integer> mylist = new ArrayList<Integer>();
		//user input for floor construction
		for (int i=1; i<=floor; i++) {
			System.out.println("Enter the floor size given on day:"+i);
			mylist.add(flr.nextInt());
		}
	
		
	FloorConstructionImpl fc = new FloorConstructionImpl( (ArrayList<Integer>) mylist); //input test.
	System.out.println("\n The order of construction is as follows:");
	fc.construct();
	
	}
}
