package jv;
import java.util.*;
import java.io.*;

public class fileReader {

	public static void main(String[] args)throws Exception {
		int c,ccnt=0,lcnt=1,wcnt=1;
		
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your file name:");
		String str=sc.next();
		FileInputStream fil=new FileInputStream(str);
		while((c=fil.read())!=-1)
			
		{
		ccnt++;
		if(c==32 || c==13)
		wcnt++;
		if(c==13)
		lcnt++;
		}
		System.out.println("Number of Characters are " + ccnt);
		System.out.println("Number of Words are 1" + wcnt);
		System.out.println("Number of Lines are "+ lcnt);
	}

}
