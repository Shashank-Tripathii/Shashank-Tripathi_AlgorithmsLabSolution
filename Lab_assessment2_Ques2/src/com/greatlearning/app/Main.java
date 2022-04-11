package com.greatlearning.app;

import java.util.*;
import com.greatlearning.model.*;


public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations");
		int size = sc.nextInt();
		int[] denom = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i=0; i<size; i++) {
			denom[i] = sc.nextInt();
			
		}
		System.out.println("Enter the amout you want to pay");
		int amount = sc.nextInt();
		Denomination d = new Denomination();
		d.compute(denom,amount);
		sc.close();
	}
}