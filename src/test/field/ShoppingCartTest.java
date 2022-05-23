package test.field;

import main.field.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void should_count_number_of_products(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        shoppingCart.add(100);

        Assert.assertEquals(2, shoppingCart.numberOfProducts());
    }

    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    public void should_return_total_prince() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(25);
        shoppingCart.add(25);

        Assert.assertEquals(50, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void singleItem_totalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void should_have_discount_if_price_is_100_or_higher() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);
        shoppingCart.add(50);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }

    @Test
    public void should_not_have_discount_if_price_is_lower_than_100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);
        shoppingCart.add(20);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }

}
