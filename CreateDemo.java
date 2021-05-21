import java.sql.*;
class CreateDemo 
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
			String sql="create table Emp(emp_id int,emp_name char)";
			PreparedStatement psl=con.prepareStatement(sql); //Use to represent precompiled SQL statements
			psl.executeUpdate(); //Use for SQL commands like create,insert,update,delete or drop etc.
			System.out.println("Table Created");
			psl.close();  //To close PreparedStatement 
			con.close(); //To close the connection

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
