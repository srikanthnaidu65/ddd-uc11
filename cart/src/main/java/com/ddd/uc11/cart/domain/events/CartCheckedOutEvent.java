package com.ddd.uc11.cart.domain.events;

import java.util.List;

public class CartCheckedOutEvent implements DomainEvent {
    private List<CartItem> items;

    public List<CartItem> getItems() {
        return items;
    }

    public CartCheckedOutEvent(List<CartItem> items) {
        this.items = items;
    }
}
