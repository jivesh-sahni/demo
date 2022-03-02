package jivesh;
import java.sql.*;
import java.util.*;

public class jdbcCreateTable {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	
{
		try{  
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","49555201");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into jivesh201 values(?,?,?)");  
			
			Scanner sc=new Scanner(System.in);
			do {
			int roll;
			System.out.println("Enter your rollno:");
			roll=sc.nextInt();
			stmt.setInt(1,roll);
			String name;
			System.out.println("Enter name:");
			name=sc.next();
			
			stmt.setString(2,name); 
			String add;
			System.out.println("Enter add:");
			add=sc.next();
			
			stmt.setString(3,add);
			  
			int i=stmt.executeUpdate(); 
			

			System.out.println(i+" records inserted"); 
			String s;
			System.out.println("Do You want to continue y/n");
			s=sc.next();
			if(s.startsWith("n")) {
				break;
			}
			
			}while(true);
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  

	}

}
