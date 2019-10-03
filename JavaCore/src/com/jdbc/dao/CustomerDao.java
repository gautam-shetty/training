package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.dbutil.DbConn;
import com.jdbc.pojo.Customer;

public class CustomerDao {

	public String saveCustomer(Customer customer) {
		try {
			Connection con = DbConn.getConnection();

			String sql = "insert into customer values(?,?,?,?)";  //table name - customer

			PreparedStatement stat = con.prepareStatement(sql);

			stat.setString(1, customer.getCustfname());
			stat.setString(2, customer.getCustlname());
			stat.setString(3, customer.getCustid());
			stat.setString(4, customer.getAddress());

			int res = stat.executeUpdate();
			if (res > 0)
				return "Customer data saved";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Cannot save customer data";

	}

	public String getSeq() {
		try {
			Connection con = DbConn.getConnection();
			String sql = "select COUNT.NEXTVAL from dual";		//sequence name - count

			PreparedStatement stat = con.prepareStatement(sql);

			ResultSet rs = stat.executeQuery();
			if (rs.next()) {
				do {
					return (Integer.toString(rs.getInt(1)));	//to point the cursor to the value needed
				} while (rs.next());
			} else return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
