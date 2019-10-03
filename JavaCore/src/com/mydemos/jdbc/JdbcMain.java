package com.mydemos.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;

//load driver;
//connect to db;
//create and execute sql statements;
//sql exception handling;

public class JdbcMain {
	
	void insertEmp(int empid,String name,int age,int deptid) {
		
		try {

			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxc", "pass");
			
			String sql="insert into emp values(?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setInt(1, empid);
			stat.setString(2, name);
			stat.setInt(3, age);
			stat.setInt(4, deptid);
			
			stat.executeUpdate();
			
			System.out.println("inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		JdbcMain jdbcMain=new JdbcMain();
		
//		jdbcMain.insertEmp(22,"name1", 20, 1);

		Scanner scan=new Scanner(System.in);

		System.out.println("plz enter name age and addrss");
		int empID=Integer.parseInt(scan.nextLine());
		String name=scan.nextLine();
		int age=Integer.parseInt(scan.nextLine());
		int deptID=Integer.parseInt(scan.nextLine());

		jdbcMain.insertEmp(empID, name, age, deptID);

	}

}
