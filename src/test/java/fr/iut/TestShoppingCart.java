package fr.iut;

import org.junit.Test;

public class TestShoppingCart {

    @Test
    public void addItem() {
        final ShoppingCart shoppingCart = new ShoppingCart();
        final Item carrot = new Item("carrot", 2.5);
        shoppingCart.addItem(carrot, 1);
    }

}
