package com.mycompany.app.dto;

/**
 * Created by Gabor_Szalay on 1/13/2017.
 */
public enum AmountType {
    PIECE("piece"), PIECES("pieces"), KG("kg");

    private String description;

    private AmountType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static AmountType fromString(String text) {
        if (text != null) {
            for (AmountType b : AmountType.values()) {
                if (text.equalsIgnoreCase(b.description)) {
                    return b;
                }
            }
        }
        return null;
    }

}
