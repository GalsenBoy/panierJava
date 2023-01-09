package model;

public class Payable {
    protected String reference;
    protected long price;

    public String label() {
        return this.reference;
    }

    public long cost() {
        return this.price;
    }

    public long taxRatePerTenThousand() {
        long tax = this.price / 100;
        return (tax / this.cost() * 10000);
    }

}