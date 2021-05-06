package interfaceAndAbstractDemo.Concretes;

import interfaceAndAbstractDemo.Abstracts.BaseCustomerManager;
import interfaceAndAbstractDemo.Abstracts.CustomerCheckService;
import interfaceAndAbstractDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	 private CustomerCheckService _customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkkIfRealPerson(customer))
        {
			super.save(customer);
        }
		else {
			System.out.println("Not a valid person");
		}
	}
	
}
