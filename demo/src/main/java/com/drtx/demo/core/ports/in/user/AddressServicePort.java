package com.drtx.demo.core.ports.in.user;

import com.drtx.demo.core.model.user.Address;

import java.util.Optional;

public interface AddressServicePort {
    Address createAddress(Address address);
    Optional<Address> findAddressById(Long id);
    Address updateAddress(Address address);
    void deleteAddress(Long id);
}
