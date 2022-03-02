package jv;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input,rev="";
		System.out.println("Enter a String ");
		input=sc.next();
		int length=input.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		if(input.equals(rev))
			System.out.println("Palindrom");
		else
			System.out.println("Not palindrom");
		

	}

}
