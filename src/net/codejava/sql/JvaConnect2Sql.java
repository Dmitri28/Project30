package net.codejava.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JvaConnect2Sql {

	public static void main(String[] args) {
	String url="jdbc:sqlserver:sqlsrv\\sqlexpress;databaseName=People";
	String userName="root";
	String password="root";
	try {
	Connection connection=DriverManager.getConnection(url, userName, password);

	}catch(SQLException e) {
		System.out.println("Oops ,there's an error:");
		e.printStackTrace();
	}
		
	}

}
