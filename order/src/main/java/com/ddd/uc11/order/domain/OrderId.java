package com.ddd.uc11.order.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class OrderId {
    private String id;

    public OrderId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderId{" +
                "id='" + id + '\'' +
                '}';
    }
}
