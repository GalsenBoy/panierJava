package model;

public class Item {
    protected String name;
    protected long price;
    protected int weight;

    public Item(String name, long price, int weight) {
        this.name = name;
        this.price = price;
        if (weight > 10000) {
            throw new IllegalStateException(
                    "Le poids ne peut pas rentrer dans le panier il doit être inférieur à 10kg");
        } else {
            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + ':' + ' ' + String.format("%.2f", this.price / 100.0);
    }

}
