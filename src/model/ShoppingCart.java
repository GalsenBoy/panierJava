package model;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> shop = new ArrayList<Item>();

    private static int nextId = 1; // variable de classe pour stocker l'ID du prochain panier créé
    private int id; //

    public ShoppingCart() {

        // Affecter à la variable d'instance `id` la valeur de `nextId` et incrémenter
        // `nextId` de 1
        id = nextId++;
    }

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

    public int getId() {
        return id;
    }

    public String getItemName() {
        String itemName = "";
        // String euro = "\u20AC";
        for (Item item : shop) {
            itemName += (item.getName()) + " " + String.format("%.2f", item.getPrice() / 100.0) + " €" + "\n";
        }
        return itemName;
    }

    public long getItemPrice() {
        long itemPrice = 0;
        for (Item item : shop) {
            itemPrice += (item.getPrice());
        }
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Panier " + this.id + " [" + this.itemCount() + " article (s)" + "]" + "\n"
                + this.getItemName();
    }

}