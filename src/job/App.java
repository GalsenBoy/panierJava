package job;

import model.*;

class App {
    public static void main(String[] args) {

        Item item1 = new Item("corn flakes", 500);
        Item item2 = new Item("caviar", 50000);
        Item item3 = new Item("water", 101);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        System.out.println(cart.itemCount()); // affiche: 3
        // System.out.println(cart.totalPrice());

    }
}