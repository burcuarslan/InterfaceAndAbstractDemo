package interfaceAndAbstractDemo.Concretes;

import interfaceAndAbstractDemo.Abstracts.CustomerCheckService;
import interfaceAndAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
