package com.ddd.uc11.order.domain.events;

import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class CartCheckedOutEvent implements DomainEvent {
    private List<CartItem> items;

    public List<CartItem> getItems() {
        return items;
    }

    public CartCheckedOutEvent(List<CartItem> items) {
        this.items = items;
    }
}
