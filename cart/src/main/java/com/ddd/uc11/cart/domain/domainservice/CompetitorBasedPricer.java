package com.ddd.uc11.cart.domain.domainservice;

import com.ddd.uc11.order.domain.Price;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class CompetitorBasedPricer {

    static Map<String, Price> competitorPrices = new HashMap<>();
    private static int discountPercentage = 10;

    static {
        competitorPrices.put("Apple Pencil", new Price(new BigDecimal(100), Currency.getInstance("USD")));
        competitorPrices.put("Sony Wireless headphone", new Price(new BigDecimal(10), Currency.getInstance("USD")));
    }

    public static Price getPrice(String productName) {
        Price price = competitorPrices.get(productName);
        return price.reduceByPercent(discountPercentage);
    }
}
