package kodlamaio_coffee_crm;
import java.util.Date;

import kodlamaio_coffee_crm.Abstract.BaseCustomerManager;
import kodlamaio_coffee_crm.Adapters.MernisServiceAdapter;
import kodlamaio_coffee_crm.Concrete.StarbucksCustomerManager;
import kodlamaio_coffee_crm.Entities.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class main {
	public static void main(String[] args) throws ParseException
	{    
		System.out.println("calisti");
        String sDate1="21/04/1967";
        System.out.println(sDate1);
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
	    System.out.println(date1);
	    BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
     	Customer customer=new Customer(1,1,"ARMAÐAN","BÝCE",date1,"32134237274");
     	customerManager.save(customer);
     	System.out.println("iþlem bitti");
	}
}
