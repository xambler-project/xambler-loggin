package com.obelixdev.core.bussines.repository.customer;

import org.springframework.stereotype.Repository;

import com.obelixdev.core.bussines.model.customer.Customer;

@Repository(value="ICustomerDao")
public class CustomerDao implements ICustomerDao {

	@Override
	public Customer getCustomer(int id) {

		if (id == 1) {
			Customer user = new Customer();
			user.setId(1);
			user.setName("ObelixDev");
			user.setNick("Obx");
			user.setMail("obelix.dev@gmail.com");
			return user;
		}

		return null;

	}

}
