package org.tnsindia.dao;

import org.tnsindia.entities.Customer;

public interface CustomerDao {
	//abstract method for crud-operatio 
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer getCustomerById(int cust_ID);
	void begintransation();
	void commitTransation();

}
