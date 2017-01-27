package com.mycompany.app.dto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Gabor_Szalay on 1/27/2017.
 */
public class DiscountItems {
    private List<Discount> discountList;

    public DiscountItems(final List<String> discountList) {
        this.discountList = parse(discountList);
    }

    private List<Discount> parse(final List<String> discountList) {
        return discountList.stream()
            .map(Discount::new)
            .collect(Collectors.toList());
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public Discount getDiscountFor(final String name) {
        return null;
    }
}
