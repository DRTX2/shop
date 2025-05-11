package com.drtx.demo.core.model.cart;

import com.drtx.demo.core.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCart {
    private Long id;
    private LocalDateTime createdAt;

    private User user;
    private List<CartItem> items;
}
