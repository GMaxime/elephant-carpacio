package fr.iut;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Item, Integer> content = new HashMap<Item, Integer>();

    public void addItem(final Item item, final int quantity) {
        content.put(item, quantity);
    }

    public Map<Item, Integer> getContent() {
        final Map<Item, Integer> copied = new HashMap<Item, Integer>();
        copied.putAll(content);
        return copied;
    }
}
