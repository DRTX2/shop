package com.drtx.demo.core.model.transaction;

import com.drtx.demo.core.model.user.User;

public class PaymentMethod {
    private Long id;
    private PaymentMethodType type;
    private String detail;
    private User owner;
}
