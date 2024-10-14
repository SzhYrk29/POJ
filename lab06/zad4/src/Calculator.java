public class Calculator {

    public double calculatePrice(TicketDiscount discount, ValidityPeriod period) {
        return 4.80 * discount.getDiscount() * period.getDiscount();
    }
}
