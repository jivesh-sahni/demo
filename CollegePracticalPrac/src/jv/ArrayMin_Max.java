package jv;

import java.util.Scanner;

public class ArrayMin_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0,n ;
		
		System.out.println("Enter Array length:");
		n=sc.nextInt();
		int a[] = new int[n];
		for (; i < a.length; i++) { 
			System.out.println("Enter Number:");
		     a[i] = sc.nextInt();
		}
		System.out.println(a[i]);
		
		   
		

	

	}

}
