package job;

import model.*;

class App {
    public static void main(String[] args) {

        // Item item1 = new Item("corn flakes", 500);
        // Item item2 = new Item("caviar", 50000);
        // Item item3 = new Item("water", 101);
        // ShoppingCart cart = new ShoppingCart();
        // cart.addItem(item1);
        // cart.addItem(item2);
        // cart.addItem(item3);
        // System.out.println(cart.itemCount()); // affiche: 3
        // System.out.println(cart.totalPrice());
        // cart.removeItem(new Item("bol", 23));
        // System.out.println(cart.itemCount());

        // ShoppingCart cart = new ShoppingCart();
        // Item item = new Item("corn flakes", 500);
        // cart.addItem(item);
        // cart.removeItem(new Item("corn flakes", 500));
        // System.out.println(cart.itemCount()); // affiche: 0

        // Item item1 = new Item("corn flakes", 501, 1000);
        // Item item2 = new Item("caviar", 50000, 500);
        // Item item3 = new Item("water", 500, 5000);
        // ShoppingCart cart = new ShoppingCart();
        // cart.addItem(item1);
        // cart.addItem(item2);
        // cart.addItem(item3);
        // // cart.addItem(item3); // lève java.lang.IllegalStateException
        // cart.removeItem(new Item("eau", 500, 5000));
        // // cart.addItem(item3); // lève java.lang.IllegalStateException
        // cart.removeItem(new Item("water", 500, 5000));
        // cart.addItem(item3); // ajout possible!

        ShoppingCart c1 = new ShoppingCart();
        System.out.println(c1.getId()); // affiche: 1
        Item item1 = new Item("corn flakes", 501, 1000);
        c1.addItem(item1);
        Item item2 = new Item("caviar", 50000, 500);
        c1.addItem(item2);
        System.out.println(c1.getId()); // affiche: 1
        ShoppingCart c2 = new ShoppingCart();
        ShoppingCart c3 = new ShoppingCart();
        Item item3 = new Item("water", 500, 5000);
        c3.addItem(item3);
        System.out.println(c2.getId()); // affiche: 2
        System.out.println(c3.getId()); // affiche: 3
    }
}