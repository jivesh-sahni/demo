package jv;
import java.util.Scanner;


public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0,y=1,z=0,n;
		System.out.println("Enter Number:");
		n=sc.nextInt();
		while(n>=z) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			
		}
		

	}

}
