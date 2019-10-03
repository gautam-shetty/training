package com.jdbc.service;

import com.jdbc.dao.CustomerDao;
import com.jdbc.pojo.Customer;

public class CustomerService {
	
	public static String trim(String word) {	//method to get first two character of a string
		return word.substring(0, 2);
	}
	public static String getSeqFormat(CustomerDao temp) {		//method to create 3 digit sequence number
		String ans="";
		int res=Integer.parseInt(temp.getSeq());
		if(res<10) { 
			ans="00"+res;
		} else if(res>9&&res<100) { 
			ans="0"+res;
		} else {
			ans=""+res;
		}
		return ans;
	}

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDao();

		Customer customer = new Customer();
		customer.setCustfname("test");
		customer.setCustlname("abc");
		String cId=trim(customer.getCustfname())+trim(customer.getCustlname())+getSeqFormat(dao); //to generate needed customer id
		customer.setCustid(cId);
		customer.setAddress("addr2");
		
		System.out.println(dao.saveCustomer(customer)+" for "+customer.getCustfname());


	}

}