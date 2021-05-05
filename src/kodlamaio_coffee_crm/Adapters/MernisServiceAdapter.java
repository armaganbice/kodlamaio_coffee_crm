package kodlamaio_coffee_crm.Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import kodlamaio_coffee_crm.Abstract.CustomerCheckService;
import kodlamaio_coffee_crm.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	public boolean checkIfRealPerson(Customer customer) {
		try {
			boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
			System.out.println("result ="+result);
			return result;
		} 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.getLocalizedMessage());
			return false;
		}
	}
}
