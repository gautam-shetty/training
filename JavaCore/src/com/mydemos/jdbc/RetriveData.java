package com.mydemos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveData {

	void getData() {

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxc", "pass");

			String sql = "select * from emp";
			PreparedStatement stat = con.prepareStatement(sql);

			ResultSet rs = stat.executeQuery();
			if (rs.next()) {
				do {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4));

				} while (rs.next());
			} else {
				System.out.println("DATA NOT FOUND");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
		new RetriveData().getData();

	}

}
