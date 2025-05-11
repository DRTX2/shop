package com.drtx.demo.core.ports.out.transaction;

import com.drtx.demo.core.model.transaction.PaymentMethod;

import java.util.List;
import java.util.Optional;

public interface PaymentMethodRepositoryPort {
    PaymentMethod save(PaymentMethod method);
    PaymentMethod update(PaymentMethod method);
    Optional<PaymentMethod> findById(Long id);
    List<PaymentMethod> findAllByUser(Long userId);
    void deleteById(Long id);
}
