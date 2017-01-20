package com.mycompany.app.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor_Szalay on 1/13/2017.
 */
public class ShoppingCart {
    private PriceItems priceItems;
    private List<CartItem> cartItemList;
    private Price totalPrice;

    public ShoppingCart(List<String> cartItems, List<String> priceItems) {
        cartItemList =  processCartItems(cartItems);
        this.priceItems = new PriceItems(priceItems);
    }

    private List<CartItem> processCartItems(final List<String> cartItems) {
        List<CartItem> result = new ArrayList<>();
        cartItems.forEach(i -> {
            result.add(new CartItem(i));
        });
        return result;
    }

    public Price getTotalPrice() {
        Price initialPrice = new Price(0D, "EUR");
        cartItemList.forEach(cartItem -> {
            Price actualPrice = priceItems.getPriceFor(cartItem.getName());
            initialPrice.add(actualPrice.multiply(cartItem.getAmount()));
        });
        return initialPrice;
    }
}
