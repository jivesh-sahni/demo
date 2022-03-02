package jivesh;
import java.sql.*;
import java.util.*;

public class OracleConnection 
{
	public static void main(String args[])
	{
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","49555201");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter your Table name");
//			String tname=sc.next();
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("create table jivesh2(roll numeric(2) primary key,name varchar(20),addr varchar(20))");  
			System.out.println("create");
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e); 
			  
			}  
			
	}

}
