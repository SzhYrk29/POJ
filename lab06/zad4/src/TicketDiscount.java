public enum TicketDiscount {
    NORMAL (1.0d),
    REDUCED (0.5d);

    private double discount;

    TicketDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
