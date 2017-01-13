package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycompany.app.dto.CartItem;
import com.mycompany.app.service.CartItemService;

/**
 * Created by Adam Kosik on 1/13/2017.
 */
@Test
public class CartItemServiceTest {

    CartItemService underTest = new CartItemService();

    public void testResultShouldContainFiveElementsForSampleList() {

        List<String> input = setupInput();

        List<CartItem> result = underTest.processCartItems(input);

        Assert.assertEquals(result.size(), 5);
    }

    public void testResultShouldContainCorrectItemsForSampleList() {
        List<String> input = setupInput();

        List<CartItem> result = underTest.processCartItems(input);

        Assert.assertEquals(result.get(0).getName(), "football");
        Assert.assertEquals(result.get(0).getAmount(), 2D);
        Assert.assertEquals(result.get(0).getAmountType().getDescription(), "pieces");

        Assert.assertEquals(result.get(1).getName(), "apple");
        Assert.assertEquals(result.get(1).getAmount(), 1D);
        Assert.assertEquals(result.get(1).getAmountType().getDescription(), "kg");

        Assert.assertEquals(result.get(2).getName(), "orange juice");
        Assert.assertEquals(result.get(2).getAmount(), 3D);
        Assert.assertEquals(result.get(2).getAmountType().getDescription(), "pieces");

        Assert.assertEquals(result.get(3).getName(), "pasta");
        Assert.assertEquals(result.get(3).getAmount(), 4D);
        Assert.assertEquals(result.get(3).getAmountType().getDescription(), "pieces");

        Assert.assertEquals(result.get(4).getName(), "chicken breast");
        Assert.assertEquals(result.get(4).getAmount(), 1.5D);
        Assert.assertEquals(result.get(4).getAmountType().getDescription(), "kg");
    }


    private List<String> setupInput() {
        List<String> result = new ArrayList<>();

        result.add("football - 2 pieces");
        result.add("apple - 1 kg");
        result.add("orange juice - 3 pieces");
        result.add("pasta - 4 pieces");
        result.add("chicken breast - 1.5 kg");

        return result;
    }
}
