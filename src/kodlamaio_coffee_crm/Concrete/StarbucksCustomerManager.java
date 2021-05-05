package kodlamaio_coffee_crm.Concrete;

import kodlamaio_coffee_crm.Abstract.BaseCustomerManager;
import kodlamaio_coffee_crm.Abstract.CustomerCheckService;
import kodlamaio_coffee_crm.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager 
{
    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService)
    {
    	this.customerCheckService=customerCheckService;
    }

    @Override
	public void save(Customer customer)
	{
		if (customerCheckService.checkIfRealPerson(customer))
		{
     		// save(customer); methods 
     		System.out.println("Customer saved "+customer.getFirstName());
    	}
		else
		{			
		    System.out.println("Not a valid person");
    	}
    }
}