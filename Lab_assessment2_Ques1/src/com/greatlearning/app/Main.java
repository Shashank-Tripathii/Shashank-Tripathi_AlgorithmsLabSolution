package com.greatlearning.app;
import java.util.Scanner;

import com.greatlearning.model.PayMoney;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array"); //asking the user to input the size of the total transactions
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of the array"); //asking for the values of the array
		for (int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int n = sc.nextInt();
		PayMoney ob = new PayMoney();
		while (n>0)
		{
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			ob.trans(arr,target);
			n--;
			}
			sc.close();
			
	}
}