package com.mycompany.app.dto;

/**
 * Created by Gabor_Szalay on 1/27/2017.
 */
public class Discount {
    private DiscountType discountType;
    private String itemName;

    public Discount(final String discountName) {
        String[] tokens = discountName.split("-");
        itemName = tokens[0].trim();
        discountType = DiscountType.fromString(tokens[1].trim());
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public String getItemName() {
        return itemName;
    }
}
