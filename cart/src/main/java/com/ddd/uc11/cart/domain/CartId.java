package com.ddd.uc11.cart.domain;

import java.util.UUID;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class CartId {
    private UUID randomUUID;

    public static CartId generateCartId() {
        return new CartId(UUID.randomUUID());
    }

    private CartId(UUID randomUUID) {
        this.randomUUID = randomUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartId cartId = (CartId) o;
        return randomUUID.equals(cartId.randomUUID);
    }

    @Override
    public int hashCode() {
        return randomUUID.hashCode();
    }
}
