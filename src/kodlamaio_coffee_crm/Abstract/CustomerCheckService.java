package kodlamaio_coffee_crm.Abstract;

import kodlamaio_coffee_crm.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
