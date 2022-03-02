package jv;

import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number & i will tell you if Odd or Even");
		
		 n=sc.nextInt();
		
		
		if(n%2==0)
			System.out.println(n+" Number is Even");
		else
			System.out.println(n+" Number is Odd");
		

	}

}
