package com.drtx.demo.core.model.cart;

import com.drtx.demo.core.model.catalog.Publication;

import java.math.BigDecimal;

public class CartItem {
    private Long id;
    private Integer quantity;

    private ShoppingCart cart;
    private Publication publication;
    private BigDecimal currentPrice;
}
