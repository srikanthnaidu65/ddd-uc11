package com.ddd.uc11.order.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public interface Entity<T> {
    public boolean hasSameIdentityAs(T other);
}
