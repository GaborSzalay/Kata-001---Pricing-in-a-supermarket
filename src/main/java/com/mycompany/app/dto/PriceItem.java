package com.mycompany.app.dto;

/**
 * javadoc!
 * Created by Adam Kosik on 1/13/2017.
 */
public class PriceItem {

    private String name;
    private Price price;
    private AmountType amountType;

    public PriceItem(final String priceItemLine) {
        setupPriceItem(priceItemLine);
    }

    private void setupPriceItem(final String priceItemLine) {
        String[] tokens = priceItemLine.split("-");
        name = tokens[0].trim();
        String[] priceAndType = tokens[1].trim().split("/");
        String[] priceItem = priceAndType[0].trim().split(" ");
        price = new Price(Double.valueOf(priceItem[0]), priceItem[1]);
        amountType = AmountType.fromString(priceAndType[1].trim());
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public AmountType getAmountType() {
        return amountType;
    }

}
