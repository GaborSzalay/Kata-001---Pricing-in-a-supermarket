package com.mycompany.app.dto;

/**
 * javadoc!
 * Created by Adam Kosik on 1/13/2017.
 */
public class Price {

    Double amount;
    String currency;

    public Price(final Double amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Price multiply(final Double multiplier) {
        return new Price(amount * multiplier, currency);
    }

    public void add(final Price addition) {
        this.amount += addition.getAmount();
    }
}
