package account.bharath.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AccountDAO {
	public static void main(String[] args) throws SQLException {
		
	Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
	
	Statement statement = connection.createStatement();
	//int executeUpdate = statement.executeUpdate("insert into account values(1,'Dixit','Aman',23456)");
	//int executeUpdate = statement.executeUpdate("update account set bal=123456");
	//execute row returns int values which tells how many rows were updated
	//int executeUpdate =statement.executeUpdate("delete from account where accno=1");
	//System.out.println(executeUpdate);
	try (ResultSet executeQuery = statement.executeQuery("select * from account")) {
		while(executeQuery.next())
		{
		 System.out.println(executeQuery.getString(2));	
		}
		
	};
	}

}
