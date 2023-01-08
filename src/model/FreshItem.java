package model;

public class FreshItem extends Item {
    private String bestBeforeDate;

    public FreshItem(String name, long price, int weight, String bestBeforeDate) {
        super(name, price, weight);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "BBD: " + this.bestBeforeDate + " " + super.toString() + " €";
    }
}
