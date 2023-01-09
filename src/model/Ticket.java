package model;

public class Ticket extends Payable {

    public Ticket(String reference, long price) {
        this.reference = reference;
        this.price = price;
    }
}
