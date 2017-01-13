package com.mycompany.app.service;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.dto.CartItem;

/**
 * javadoc!
 * Created by Adam Kosik on 1/13/2017.
 */
public class CartItemService {

    public List<CartItem> processCartItems(final List<String> input) {
        final List<CartItem> cartItems = new ArrayList<>();
        input.forEach(i -> {
            cartItems.add(parseCartInput(i));
        });
        return cartItems;
    }

    private CartItem parseCartInput(final String i) {
        return new CartItem(i);
    }
}
