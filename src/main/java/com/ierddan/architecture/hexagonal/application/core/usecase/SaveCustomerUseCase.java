package com.ierddan.architecture.hexagonal.application.core.usecase;

import com.ierddan.architecture.hexagonal.application.core.domain.Address;
import com.ierddan.architecture.hexagonal.application.core.domain.Customer;
import com.ierddan.architecture.hexagonal.application.ports.out.FindAddressByCepOutputPort;
import com.ierddan.architecture.hexagonal.application.ports.out.SaveCustomerOutputPort;

public class SaveCustomerUseCase {

    private final FindAddressByCepOutputPort findAddressByCep;
    private final SaveCustomerOutputPort saveCustomerOutputPort;

    public SaveCustomerUseCase(FindAddressByCepOutputPort findAddressByCep, SaveCustomerOutputPort saveCustomerOutputPort) {
        this.findAddressByCep = findAddressByCep;
        this.saveCustomerOutputPort = saveCustomerOutputPort;
    }

    public Customer savCustomer(Customer customer, String zipCode) {
        Address address = findAddressByCep.getAddress(zipCode);
        customer.setAddress(address);
        return saveCustomerOutputPort.saveCustomer(customer);
    }

}
