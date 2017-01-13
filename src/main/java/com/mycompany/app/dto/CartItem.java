package com.mycompany.app.dto;

/**
 * Sample javadoc.
 * Created by Adam_Kosik on 1/13/2017.
 */
public class CartItem {

    private String name;
    private Double amount;
    private AmountType amountType;

    public CartItem(final String unProcessedLine) {
        setupCartItem(unProcessedLine);
    }

    private void setupCartItem(final String unProcessedLine) {
        String[] tokens = unProcessedLine.split("-");
        name = tokens[0].trim();
        String[] amountAndType = tokens[1].trim().split(" ");
        amount = Double.valueOf(amountAndType[0]);
        amountType = AmountType.fromString(amountAndType[1]);
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public AmountType getAmountType() {
        return amountType;
    }

}