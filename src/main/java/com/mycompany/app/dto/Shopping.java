package com.mycompany.app.dto;

import java.util.List;

/**
 * Created by Gabor_Szalay on 1/13/2017.
 */
public class Shopping {
    private List<CartItem> cartItems;
    private List<PriceItem> priceItems;

    public Shopping(List<CartItem> cartItems, List<PriceItem> priceItems) {
        this.cartItems = cartItems;
        this.priceItems = priceItems;
    }
}
