package com.mycompany.app.service;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.dto.CartItem;
import com.mycompany.app.dto.PriceItem;

/**
 * javadoc!
 * Created by Adam Kosik on 1/13/2017.
 */
public class PriceItemService {

    public List<PriceItem> processPrices(final List<String> prices) {
        final List<PriceItem> priceItems = new ArrayList<>();
        prices.forEach(i -> {
            priceItems.add(parsePriceInput(i));
        });
        return priceItems;
    }

    private PriceItem parsePriceInput(final String priceItemLine) {
        return new PriceItem(priceItemLine);
    }
}
