package com.ddd.uc11.cart.domain.events;


import com.ddd.uc11.cart.domain.Price;

public class ItemAddedToCartEvent implements DomainEvent {
    private String productName;
    private int quantity;
    private Price price;

    public ItemAddedToCartEvent(String productName, int quantity, Price price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Price getPrice() {
        return price;
    }
}
