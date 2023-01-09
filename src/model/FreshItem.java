package model;

import java.util.Objects;

public class FreshItem extends Item {
    private String bestBeforeDate;

    public FreshItem(String name, long price, int weight, String bestBeforeDate) {
        super(name, price, weight);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FreshItem))
            return false;
        FreshItem item = (FreshItem) o;
        return Objects.equals(name, item.name) &&
                price == item.price && weight == item.weight && bestBeforeDate == item.bestBeforeDate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "BBD: " + this.bestBeforeDate + " " + super.toString() + " €";
    }
}
