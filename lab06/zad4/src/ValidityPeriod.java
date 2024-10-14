public enum ValidityPeriod {
    ONE_RIDE (1.0d),
    ONE_HOUR (1.5d),
    ONE_DAY (4.5d);

    private double discount;
    ValidityPeriod(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
