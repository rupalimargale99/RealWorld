import java.sql.*;
class UpdateDemo
{
	public static void main(String[] args)throws Exception 
	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Establish the connection to the JdbcOdbcDriver bridge
			System.out.println("Driver Loaded");
			String url="Jdbc:Odbc:rupa";
			Connection con=DriverManager.getConnection(url); //To open connection
			System.out.println("Connection Established");
			String s="create table Pro(Product_no int,Product_name char)";
			PreparedStatement p=con.prepareStatement(s); //Use to represent precompiled SQL statements
			p.executeUpdate(); //Use for SQL commands like create,insert,update,delete or drop etc.
			System.out.println("Table Created");
			String s1="insert into Pro values(1,'Mobile')";
			PreparedStatement p1=con.prepareStatement(s1); //Use to represent precompiled SQL statements
			p1.executeUpdate(); 
                   String s2="insert into Pro values(2,'tv')";
			PreparedStatement p2=con.prepareStatement(s2); //Use to represent precompiled SQL statements
			p2.executeUpdate();
			String s3="insert into Pro values(3,'computer')";
			PreparedStatement p3=con.prepareStatement(s3); //Use to represent precompiled SQL statements
			p3.executeUpdate();
			String s4="insert into Pro values(4,'Computer')";
                   PreparedStatement p4=con.prepareStatement(s4); //Use to represent precompiled SQL statements
			p4.executeUpdate(); 
                   String s5="insert into Pro values(5,'Laptop')";
                   PreparedStatement p5=con.prepareStatement(s5); //Use to represent precompiled SQL statements
			p5.executeUpdate(); 
                   String s6="insert into Pro values(6,'tablet')";
			PreparedStatement p6=con.prepareStatement(s6); //Use to represent precompiled SQL statements
			p6.executeUpdate(); 
                   String s7="insert into Pro values(7,'laptop')";
			PreparedStatement p7=con.prepareStatement(s7); //Use to represent precompiled SQL statements
			p7.executeUpdate();
			System.out.println("Values Inserted");
                  String s8="Update Pro set Product_name='computer' where Product_name='tv'";
			PreparedStatement p8=con.prepareStatement(s8);//Use to represent precompiled SQL statements
			int x=p8.executeUpdate();
			if(x==1)
			{
				System.out.println("Table updated");
			}
			else
			{
		        	System.out.println("Table is not updated");
			}
			con.close(); //To close the connection
	}
}
