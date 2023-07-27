package com.ierddan.architecture.hexagonal.adapters.out.client;

import com.ierddan.architecture.hexagonal.adapters.out.client.response.AddressResponse;
import com.ierddan.architecture.hexagonal.application.core.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "via-cep-api", url = "viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{addressCode}/json")
    AddressResponse findAddress(@PathVariable String addressCode);

}
