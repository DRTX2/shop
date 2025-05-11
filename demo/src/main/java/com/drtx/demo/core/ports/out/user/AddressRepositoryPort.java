package com.drtx.demo.core.ports.out.user;

import com.drtx.demo.core.model.user.Address;

import java.util.Optional;
import java.util.List;

public interface AddressRepositoryPort {
    Address save(Address address);
    Optional<Address> findById(Long id);
    Address update(Address address);
    void deleteById(Long id);
    List<Address> findByUserId(Long userId); // útil para frontend
}
