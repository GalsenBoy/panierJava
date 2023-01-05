package model;

public class Item {
    private String name;
    private long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + ':' + ' ' + String.format("%.2f", this.price / 100.0);
    }
}
