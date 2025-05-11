package com.drtx.demo.core.ports.out.cart;

import com.drtx.demo.core.model.cart.CartItem;
import com.drtx.demo.core.model.cart.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartRepositoryPort {

    ShoppingCart save(ShoppingCart cart);
    Optional<ShoppingCart> findByUserId(Long userId);
    Optional<ShoppingCart> findById(Long cartId);
    void deleteById(Long cartId);

    void addItem(Long cartId, CartItem item);
    void removeItem(Long cartId, Long itemId);
    boolean existsItemInCart(Long cartId, Long publicationId);
    void clearCart(Long cartId);
    List<CartItem> findItemsInCart(Long cartId);
}
