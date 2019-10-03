package com.mydemos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class task1 {

	static String rev(String data) {
		char[] arr = data.toCharArray();
		String rarr = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rarr += arr[i];
		}
		return rarr;
	}

	void insertEmp(String name) {
			
			try {
	
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxc", "pass");
				
				String sql="insert into table1 values(?)";
				PreparedStatement stat=con.prepareStatement(sql);
				
				stat.setString(1, name);
				
				stat.executeUpdate();
				
//				System.out.println("Data inserted");
	
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	void getData() {
		
		String op="";

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxc", "pass");

			String sql = "select * from table1";
			PreparedStatement stat = con.prepareStatement(sql);

			ResultSet rs = stat.executeQuery();
			if (rs.next()) {
				do {
					op+=(rev(rs.getString(1))+",");

				} while (rs.next());
			} else {
				System.out.println("DATA NOT FOUND");
			}
			
			op=op.substring(0, op.length() - 1);
			
			System.out.println(op);

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) {

		String temp;
		task1 t1=new task1();
		String str = "Gautam,Aryamann,Sahil,Prateek";
		String[] arrOfStr = str.split(",");

		for (String a : arrOfStr) {
			temp = rev(a);
			t1.insertEmp(temp);
		}
//		System.out.println("\n");
		
		new task1().getData();

	}

}
