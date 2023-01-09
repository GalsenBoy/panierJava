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
        //

        // ShoppingCart c1 = new ShoppingCart();
        // System.out.println(c1.getId()); // affiche: 1
        // Item item1 = new Item("corn flakes", 501, 1000);
        // c1.addItem(item1);
        // Item item2 = new Item("caviar", 50000, 500);
        // c1.addItem(item2);
        // System.out.println(c1.getId()); // affiche: 1
        // ShoppingCart c2 = new ShoppingCart();
        // ShoppingCart c3 = new ShoppingCart();
        // Item item3 = new Item("water", 500, 5000);
        // c3.addItem(item3);
        // System.out.println(c2.getId()); // affiche: 2
        // System.out.println(c3.getId()); // affiche: 3

        // System.out.println(c1); // affiche: panier 1 [2 article(s)]
        // // corn flakes: 5.01 €
        // // caviar: 500.00 €

        // System.out.println(c2); // affiche: panier 2 [0 article(s)]

        // System.out.println(c3); // affiche: panier 3 [1 article(s)]
        // // water: 5.00 €

        // Item item1 = new Item("corn flakes", 500, 1000);
        // System.out.println(item1); // affiche: corn flakes: 5.00€
        // FreshItem fresh = new FreshItem("Salmon", 1450, 800, "2012-04-11");
        // System.out.println(fresh); // affiche: BBD:2012-04-11 Salmon: 14.50€

        // Item tin = new Item("sardine", 500, 500);
        // FreshItem fresh = new FreshItem("sardine", 500, 500, "2012-04-11");
        // ShoppingCart cart = new ShoppingCart();
        // cart.addItem(fresh);
        // cart.removeItem(tin);
        // System.out.println(cart); // affiche: panier 1 [1 article(s)]
        // BBD: 2012-04-11 sardine: 5.00 €

        // Payable payable = new Ticket("RGBY17032012 - Walles-France", 9000);
        // System.out.println(payable.label()); // affiche: RGBY17032012 - Walles-France
        // System.out.println(payable.cost()); // affiche: 9000
        // System.out.println(payable.taxRatePerTenThousand()); // affiche: 2500

        Invoice invoice = new Invoice();
        Payable payable = new Ticket("RGBY20120317 - Walles-France", 9000);
        Ticket ticket = new Ticket("MUSI20120612 - RollingStones", 12000);
        invoice.add(payable);
        invoice.add(ticket);
        Item item = new Item("corn flakes", 500, 1000);
        invoice.add(item);
    }
}