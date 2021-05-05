package kodlamaio_coffee_crm.Concrete;

import kodlamaio_coffee_crm.Abstract.CustomerCheckService;
import kodlamaio_coffee_crm.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
