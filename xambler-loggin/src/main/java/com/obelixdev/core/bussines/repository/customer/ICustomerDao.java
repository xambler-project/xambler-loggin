/**
 * 
 */
package com.obelixdev.core.bussines.repository.customer;

import com.obelixdev.core.bussines.model.customer.Customer;

/**
 * @author jorgguca
 *
 */
public interface ICustomerDao {

	Customer getCustomer(int id);	

}
