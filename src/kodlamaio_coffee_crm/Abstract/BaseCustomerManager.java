package kodlamaio_coffee_crm.Abstract;

import kodlamaio_coffee_crm.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db :"+customer.getFirstName());
	}

}
