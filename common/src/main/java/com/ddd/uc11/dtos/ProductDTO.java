package com.ddd.uc11.dtos;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class ProductDTO {
    public String name;
    public PriceDTO price;

    public ProductDTO(String name, PriceDTO price) {
        this.name = name;
        this.price = price;
    }
}
