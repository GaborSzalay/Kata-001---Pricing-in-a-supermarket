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

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Price price = (Price) o;

        if (amount != null ? !amount.equals(price.amount) : price.amount != null) {
            return false;
        }
        return currency != null ? currency.equals(price.currency) : price.currency == null;

    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
