package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycompany.app.dto.PriceItem;
import com.mycompany.app.service.PriceItemService;

/**
 * Created by Gabor_Szalay on 1/13/2017.
 */
@Test
public class PriceItemServiceTest {
    private PriceItemService underTest = new PriceItemService();

    public void testPricingLinesAreProcessedTheSameWay() {
        List<String> prices = setupPrices();

        List<PriceItem> result = underTest.processPrices(prices);

        Assert.assertEquals(result.get(0).getName(), "football");
        Assert.assertEquals(result.get(0).getPrice().getAmount(), 17D);
        Assert.assertEquals(result.get(0).getPrice().getCurrency(), "EUR");
        Assert.assertEquals(result.get(0).getAmountType().getDescription(), "piece");

        //author: Adam Kosik
        Assert.assertEquals(result.get(1).getName(), "apple");
        Assert.assertEquals(result.get(1).getPrice().getAmount(), 0.7D);
        Assert.assertEquals(result.get(1).getPrice().getCurrency(), "EUR");
        Assert.assertEquals(result.get(1).getAmountType().getDescription(), "kg");

    }


    private List<String> setupPrices() {
        List<String> result = new ArrayList<>();

        result.add("football - 17 EUR / piece");
        result.add("apple - 0.7 EUR / kg");
        result.add("orange juice - 1.5 EUR / piece");
        result.add("pasta - 1.2 EUR / piece");
        result.add("chicken breast - 5.3 EUR / kg");

        return result;
    }
}
