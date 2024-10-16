package com.learn.java;
import java.sql.*;

public class ConnectJDBC {
    public static void main(String[] args) {
        try {
        	//1.Load jdbc driver
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	//2.Establish connection with mysql
        	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name","user","password");

        	//3.create statement to execute
        	Statement stm = conn.createStatement();
        	
        	
        	//4.Execute a query
        	ResultSet rs = stm.executeQuery("SELECT * FROM table_name");
        	
        	// 5.process the result
        	while(rs.next()) {
        		System.out.println(rs.getString("col1") + " " + rs.getString("col2"));
        	}
        	

        	
        	rs.close();
        	stm.close();
        	conn.close();
        	
        	
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
