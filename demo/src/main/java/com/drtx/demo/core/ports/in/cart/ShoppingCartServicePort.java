package com.drtx.demo.core.ports.in.cart;

import com.drtx.demo.core.model.cart.CartItem;
import com.drtx.demo.core.model.cart.ShoppingCart;

import java.math.BigDecimal;

public interface ShoppingCartServicePort {
    ShoppingCart createCart(ShoppingCart shoppingCart);
    ShoppingCart getCartByUserId(Long userId);
    void addItemToCart(Long cartId, CartItem item);
    boolean itemExistsInCart(Long cartId, Long publicationId);
    void removeItemFromCart(Long cartId, Long itemId);
    BigDecimal calculateTotal();
    void clearCart(Long cartId);
    void deleteCart(Long id);
}
