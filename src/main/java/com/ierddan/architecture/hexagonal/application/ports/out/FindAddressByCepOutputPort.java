package com.ierddan.architecture.hexagonal.application.ports.out;

import com.ierddan.architecture.hexagonal.application.core.domain.Address;

public interface FindAddressByCepOutputPort {

    Address getAddress(String addressCode);
}

