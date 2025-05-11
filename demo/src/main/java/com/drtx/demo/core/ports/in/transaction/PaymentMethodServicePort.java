package com.drtx.demo.core.ports.in.transaction;

import com.drtx.demo.core.model.transaction.PaymentMethod;

import java.util.List;

public interface PaymentMethodServicePort {
    PaymentMethod createPaymentMethod(PaymentMethod method);
    PaymentMethod updatePaymentMethod(PaymentMethod method);
    List<PaymentMethod> findAllByUser(Long userId);
    void deletePaymentMethod(Long id);
}
