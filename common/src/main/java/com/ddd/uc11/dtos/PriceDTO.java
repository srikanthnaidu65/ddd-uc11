package com.ddd.uc11.dtos;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class PriceDTO {
    public BigDecimal value;
    public Currency currency;

    public PriceDTO(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
}
