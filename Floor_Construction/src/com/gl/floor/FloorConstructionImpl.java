package com.gl.floor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FloorConstructionImpl {
	PriorityQueue<Integer> pqDynamic;
	PriorityQueue<Integer>pqStatic;
	ArrayList<Integer>array;
	
	FloorConstructionImpl(ArrayList<Integer>array)
	{
		this.array=array;
		pqStatic = new PriorityQueue<>(Collections.reverseOrder());
		pqDynamic = new PriorityQueue<>(Collections.reverseOrder()); //dynamic track of the floors constructed
		pqStatic.addAll(array); //keep track of the highest floor
	}
	
	
	public void construct()
	{
		int day=1;
		for(Integer i : array)
		{
			boolean constructedFlag=false;
			System.out.printf("Day %d\n",day);
			
			if(i==pqStatic.peek()) { //if the next highest floor is released on that day.
				pqDynamic.add(i);
				
				while(pqStatic.peek()==pqDynamic.peek()&&!pqDynamic.isEmpty()) { //construct all the pending smaller floors sequentially
					constructedFlag=true;
					pqStatic.remove();
					System.out.print(pqDynamic.remove()+" ");
				}
				System.out.println("\n");
		}
			
			else
				pqDynamic.add(i);
		day++;
		
		if(!constructedFlag)
			System.out.println("The floor size: "+pqStatic.peek()+" is unavailable\n");
		}
	}

}
