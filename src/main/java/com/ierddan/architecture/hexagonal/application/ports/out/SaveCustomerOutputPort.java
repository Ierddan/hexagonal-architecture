package com.ierddan.architecture.hexagonal.application.ports.out;

import com.ierddan.architecture.hexagonal.application.core.domain.Customer;

public interface SaveCustomerOutputPort {

    Customer saveCustomer(Customer customer);

}
