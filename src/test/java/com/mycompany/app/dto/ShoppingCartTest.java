package com.mycompany.app.dto;

import static org.testng.AssertJUnit.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Krisztian_Papp on 1/13/2017.
 */
@Test
public class ShoppingCartTest {

    private ShoppingCart underTest;

    @BeforeMethod
    public void setUp() {
        underTest = new ShoppingCart(setupCartItemInput(), setupPriceItemInput(), setupDiscountInput());
    }

    @Test
    public void testGetDiscountListSize() {
        assertEquals(underTest.getDiscountList().size(), 1);
    }

    @Test
    public void testGetDiscountListContent() throws Exception {
        assertEquals(underTest.getDiscountList().get(0).getItemName(), "orange juice");
        assertEquals(underTest.getDiscountList().get(0).getDiscountType(), DiscountType.THREEFORTWO);
    }

    @Test
    public void testCalculateTotalPrice() {
        Price totalPrice = underTest.getTotalPrice();
        Assert.assertEquals(totalPrice.getAmount(), 51.95D);
        Assert.assertEquals(totalPrice.getCurrency(), "EUR");
    }

    @Test
    public void testGetDiscountedPrice() {
        DiscountedPrice discountedPrice = underTest.getDiscountedPrice();
        assertEquals(discountedPrice.getTotal(), new Price(51.95D, "EUR"));
        assertEquals(discountedPrice.getDiscountedTotal(), new Price(50.45D, "EUR"));
    }

    private List<String> setupCartItemInput() {
        List<String> result = new ArrayList<>();

        result.add("football - 2 pieces");
        result.add("apple - 1 kg");
        result.add("orange juice - 3 pieces");
        result.add("pasta - 4 pieces");
        result.add("chicken breast - 1.5 kg");

        return result;
    }

    private List<String> setupPriceItemInput() {
        List<String> result = new ArrayList<>();

        result.add("football - 17 EUR / piece");
        result.add("apple - 0.7 EUR / kg");
        result.add("orange juice - 1.5 EUR / piece");
        result.add("pasta - 1.2 EUR / piece");
        result.add("chicken breast - 5.3 EUR / kg");

        return result;
    }

    private List<String> setupDiscountInput() {
        List<String> result = new ArrayList<>();

        result.add("orange juice - threefortwo");

        return result;
    }
}
