package model;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> shop = new ArrayList<Item>();

    public void addItem(Item item) {
        shop.add(item);
    }

    public void removeItem(Item item) {
        shop.remove(item);
    }

    public int itemCount() {
        return shop.size();
    }

    public long totalPrice() {
        long sum = 0;
        for (Item i : shop) {
            sum += i.getPrice();
        }
        return sum;
    }
}