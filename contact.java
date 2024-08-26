package kavindb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.jdbc.JdbcPreparedStatement;
class man{
	Scanner sc=new Scanner(System.in);
	String name;
	String ph;
	String address;
	
		
	
	void sets(String a) {
		this.name=a;
	}
	void setp(String l) {
		this.ph=l;
	}
	void seta(String a) {
		this.address=a;
	}
	
	 String jdbcURL = "jdbc:mysql://localhost:3306/student"; // Adjust database URL and name
    String username = "root"; // Default username for XAMPP
    String password = ""; // Default password for XAMPP
	void add(man c) {
		System.out.println("name:");
		c.name=sc.nextLine();
		System.out.println("number:");
		c.ph=sc.nextLine();
		System.out.println("email address:");
		c.address=sc.nextLine();
		try {
	         // Establishing connection
	         Connection connection = DriverManager.getConnection(jdbcURL, username, password);

	         if (connection != null) {
	             String sql = "insert into contact values (?,?,?)";
	             PreparedStatement statement = connection.prepareStatement(sql);
	             statement.setString(1, c.name);
	             statement.setString(2, c.ph);
	             statement.setString(3, c.address);
	             
	             statement.executeUpdate();
	             System.out.println("contact was added");

	         }

	         // Closing connection
	         connection.close();

	     } catch (SQLException e) {
	         System.out.println(e);
	     }
	}
	void dis() {
		
		try {
	         // Establishing connection
	         Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            
	         if (connection != null) {
	            // System.out.println("Connected to the database successfully!");
	             String sql = "select*from contact";
	             Statement s=connection.createStatement();
	             ResultSet r=s.executeQuery(sql);
	             while(r.next()) {
	            	 String a=r.getString(1);
	            	 String b=r.getString(2);
	            	 System.out.println(a+" "+b);
	             }
	         }

	         // Closing connection
	         connection.close();

	     } catch (SQLException e) {
	         System.out.println(e);
	     }
	}
	public void se() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name to serach:");
		String a=sc.nextLine();
		try {
	         // Establishing connection
	         Connection connection = DriverManager.getConnection(jdbcURL, username, password);
           
	         if (connection != null) {
	             //System.out.println("Connected to the database successfully!");
	             String sql = "select*from contact where name='"+a+"';";
	             Statement s=connection.createStatement();
	             ResultSet r=s.executeQuery(sql);
	             while(r.next()) {
	            	System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
	             }
	         }

	         // Closing connection
	         connection.close();

	     } catch (SQLException e) {
	         System.out.println(e);
	     }
	}
	public void edit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter who's details have to be edited");
		String a=sc.nextLine();
		System.out.println("what have to be edited name,ph.no or email");
		String b=sc.nextLine();
		System.out.println("have to be edited as");
		String c=sc.nextLine();
		try {
	         // Establishing connection
	         Connection connection = DriverManager.getConnection(jdbcURL, username, password);
          
	         if (connection != null) {
	             //System.out.println("Connected to the database successfully!");
	             String sql = "update contact set "+b+"='"+c+"' where name='"+a+"';";
	             PreparedStatement s=connection.prepareStatement(sql);
	             s.executeUpdate();
	             System.out.println("updated");
	         }

	         // Closing connection
	         connection.close();

	     } catch (SQLException e) {
	         System.out.println(e);
		
	}
}
}
public class contact extends man{
	public static void main(String[] args) {
	
		man m=new man();
		Scanner sc=new Scanner(System.in);
	   int i=0,ch=-1;
	   do {
		   System.out.println("1 to add");
		   System.out.println("2 to display all");
		   System.out.println("3 to search");
		   System.out.println("4 to edit");
		   System.out.println("0 to exit");
		   ch=sc.nextInt();
		   switch(ch) {
		   case 1:
			   m.add(m);
			   break;
		   case 2:
			   m.dis();
			   break;
		   case 3:
			   m.se();
			   break;
		   case 4:
			   m.edit();
			   
		   }
		   
	   }while(ch!=0);
	}

}
