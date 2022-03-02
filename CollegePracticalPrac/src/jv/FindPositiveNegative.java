package jv;
import java.util.Scanner;

public class FindPositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number:");
		n=sc.nextInt();
		if(n>0)
			System.out.println(n+" Positive");
		else
			System.out.println(n+" Negative");
		
		
			

	}

}
