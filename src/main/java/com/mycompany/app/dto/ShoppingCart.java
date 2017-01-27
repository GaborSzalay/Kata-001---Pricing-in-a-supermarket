package com.mycompany.app.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor_Szalay on 1/13/2017.
 */
public class ShoppingCart {
    private PriceItems priceItems;
    private List<CartItem> cartItemList;
    private DiscountItems discountList;
    private Price totalPrice;

    public ShoppingCart(List<String> cartItems, List<String> priceItems, final List<String> discountList) {
        this.cartItemList = processCartItems(cartItems);
        this.priceItems = new PriceItems(priceItems);
        this.discountList = new DiscountItems(discountList);
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

    public DiscountedPrice getDiscountedPrice() {
        DiscountedPrice result = new DiscountedPrice(getTotalPrice(), calculateDiscountedPrice());

        return result;
    }

    private Price calculateDiscountedPrice() {
        return new Price(50.45D, "EUR");
    }

    public DiscountItems getDiscountList() {
        return discountList;
    }
}
