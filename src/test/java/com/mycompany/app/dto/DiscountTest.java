package com.mycompany.app.dto;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

/**
 * Created by Gabor_Szalay on 1/27/2017.
 */
public class DiscountTest {

    @Test
    public void testConstructor() {
        Discount discount = new Discount("orange juice - threefortwo");
        assertEquals(DiscountType.THREEFORTWO, discount.getDiscountType());
        assertEquals("orange juice", discount.getItemName());
    }
}