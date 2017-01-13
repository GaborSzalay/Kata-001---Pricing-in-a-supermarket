package com.mycompany.app;

import org.easymock.EasyMock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mycompany.app.dto.Shopping;
import com.mycompany.app.service.CartItemService;
import com.mycompany.app.service.PriceItemService;

/**
 * Created by Krisztian_Papp on 1/13/2017.
 */
@Test
public class ShoppingTest {

    private Shopping underTest;
    private CartItemService cartItemService;
    private PriceItemService priceItemService;


    @BeforeMethod
    public void setUp() {
        cartItemService = EasyMock.createMock(CartItemService.class);
        priceItemService = EasyMock.createMock(PriceItemService.class);
        underTest = new Shopping();
    }
}
