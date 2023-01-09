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

    public void taxRatePerTenThousand() {

    }

}