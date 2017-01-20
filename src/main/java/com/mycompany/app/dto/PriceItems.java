package com.mycompany.app.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * javadoc!
 * Created by Adam_Kosik on 1/20/2017.
 */
public class PriceItems {

    private final List<PriceItem> priceItems;

    public PriceItems(final List<String> priceItemList) {
        this.priceItems = parsePrices(priceItemList);
    }

    private List<PriceItem> parsePrices(List<String> priceItems) {
        List<PriceItem> result = new ArrayList<>();
        priceItems.forEach(i -> {
            result.add(new PriceItem(i));
        });
        return result;
    }

    public Price getPriceFor(final String name) {
        Price result = null;
        for (PriceItem currentPriceItem:
             priceItems) {
            if (currentPriceItem.getName().equals(name)) {
                result = currentPriceItem.getPrice();
            }
        }
        return result;
    }
}
