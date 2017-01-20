package com.mycompany.app.dto;

import java.util.List;

/**
 * javadoc!
 * Created by Adam Kosik on 1/20/2017.
 */
public class CartItems {
    private final List<CartItem> cartItems;

    public CartItems(final List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
