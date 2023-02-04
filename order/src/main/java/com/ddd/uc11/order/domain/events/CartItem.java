package com.ddd.uc11.order.domain.events;

import com.ddd.uc11.order.domain.Price;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class CartItem {
    private String name;
    private int quantity;
    private Price price;

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public CartItem(String name, Price price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
