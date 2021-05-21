import java.sql.*;
class PreStatementDemo
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Establish the connection to the JdbcOdbcDriver bridge
			System.out.println("Driver Loaded");
			String url="Jdbc:Odbc:rupa";
			Connection con=DriverManager.getConnection(url); //To open connection
			System.out.println("Connection Established");

			String s="create table Student1(Roll_no int,Name char,Percentage int)";
			PreparedStatement p=con.prepareStatement(s); //Use to represent precompiled SQL statements
			p.executeUpdate(); //Use for SQL commands like create,insert,update,delete or drop etc.
			System.out.println("Table Created");
			String s1="insert into Student1 values(1,'Rupa',95)";
			PreparedStatement p1=con.prepareStatement(s1); //Use to represent precompiled SQL statements
			p1.executeUpdate(); 
			String s2="insert into Student1 values(2,'Sonali',80)";
			PreparedStatement p2=con.prepareStatement(s2); //Use to represent precompiled SQL statements
			p2.executeUpdate();
			String s3="insert into Student1 values(3,'Akansha',69)";
			PreparedStatement p3=con.prepareStatement(s3); //Use to represent precompiled SQL statements
			p3.executeUpdate();
			String s4="insert into Student1 values(4,'Tejal',70)";
			PreparedStatement p4=con.prepareStatement(s4); //Use to represent precompiled SQL statements
			p4.executeUpdate(); 
			String s5="insert into Student1 values(5,'Tanu',65)";
			PreparedStatement p5=con.prepareStatement(s5); //Use to represent precompiled SQL statements
			p5.executeUpdate(); 
			String s6="insert into Student1 values(6,'Shraddha',71)";
			PreparedStatement p6=con.prepareStatement(s6); //Use to represent precompiled SQL statements
			p6.executeUpdate(); 
			String s7="insert into Student1 values(7,'POoja',56)";
			PreparedStatement p7=con.prepareStatement(s7); //Use to represent precompiled SQL statements
			p7.executeUpdate();
			System.out.println("Values Inserted");
			String s8="select Roll_no,Name from Student1 where Percentage>70";
			PreparedStatement p8=con.prepareStatement(s8); //Use to represent precompiled SQL statements
			ResultSet r=p8.executeQuery();  //Use to exeecute SELECT query for database
			r=p8.getResultSet();
			System.out.println("Roll_no"+"    "+"Name");
			System.out.println();
			while(r.next()) //Move record pointer to next row
			{
				System.out.println(r.getInt("Roll_no")+"         "+r.getString("Name"));
			}
			con.close(); //To close the connection

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
