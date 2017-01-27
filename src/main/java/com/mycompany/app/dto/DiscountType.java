package com.mycompany.app.dto;

/**
 * Created by Gabor_Szalay on 1/27/2017.
 */
public enum DiscountType {
    THREEFORTWO("threefortwo"), PERCENTAGE("percentage");

    private String description;

    private DiscountType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static DiscountType fromString(String text) {
        if (text != null) {
            for (DiscountType b : DiscountType.values()) {
                if (text.equalsIgnoreCase(b.description)) {
                    return b;
                }
            }
        }
        return null;
    }
}
