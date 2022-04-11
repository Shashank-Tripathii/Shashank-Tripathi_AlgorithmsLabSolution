package com.greatlearning.model;

import com.greatlearning.service.*;

public class Denomination{
	public void compute(int[] arr, int amount) { 
		
		
		Sort s = new Sort();
		s.sorting(arr, 0, arr.length - 1);
		int[] curr_notes = new int[arr.length];
		boolean flag=true;
		for (int i=0; i<arr.length; i++) {
			curr_notes[i] = amount /arr[i];
			amount = amount % arr[i];
			
		}
		
		
		if (amount % arr[arr.length - 1] != 0 )
		{
			flag = false;
			
		}
		if (flag == true) {
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for (int i=0; i<arr.length; i++)
			{
				if (curr_notes[i] != 0)
				{
					System.out.println(arr[i] + ":" + curr_notes[i]);
					
				}
				
			}
		}else 
		{
			System.out.println("Exact amount can not be tendered");
			
		}
	}
}