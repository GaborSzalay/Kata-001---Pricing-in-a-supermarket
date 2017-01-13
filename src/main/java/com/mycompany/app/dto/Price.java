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

}
