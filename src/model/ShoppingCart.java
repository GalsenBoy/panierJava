package model;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> shop = new ArrayList<Item>();

    public void addItem(Item item) {
        shop.add(item);
    }

    public int itemCount() {
        return shop.size();
    }

    public double totalPrice() {
        double total = 0;
        return total;
    }

}
