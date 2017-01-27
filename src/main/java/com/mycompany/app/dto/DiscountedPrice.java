package com.mycompany.app.dto;

/**
 * Created by Gabor_Szalay on 1/27/2017.
 */
public class DiscountedPrice {
    private Price total;
    private Price discountedTotal;

    public DiscountedPrice(final Price total, final Price discountedTotal) {
        this.total = total;
        this.discountedTotal = discountedTotal;
    }

    public Price getTotal() {
        return total;
    }

    public Price getDiscountedTotal() {
        return discountedTotal;
    }
}
