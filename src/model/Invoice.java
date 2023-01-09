package model;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Payable> p = new ArrayList<>();
    ArrayList<Item> i = new ArrayList<>();

    public void add(Payable pay) {
        p.add(pay);
    }

    public void add(Item it) {
        i.add(it);
    }
}
