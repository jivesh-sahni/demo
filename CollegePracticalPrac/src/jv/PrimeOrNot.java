package jv;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,count=0,i=1;
		System.out.println("Enter Number:");
		n=sc.nextInt();
		while(i<=n) {
			if(n%i==0)
				count=count+1;
			i=i+1;
			
		}
		if(count==2)
			System.out.println(n+" Prime");
		else
			System.out.println(n+" Not Prime ");
		

	}

}
