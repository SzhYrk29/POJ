public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculatePrice(TicketDiscount.NORMAL, ValidityPeriod.ONE_RIDE));
        System.out.println(calc.calculatePrice(TicketDiscount.NORMAL, ValidityPeriod.ONE_HOUR));
        System.out.println(calc.calculatePrice(TicketDiscount.NORMAL, ValidityPeriod.ONE_DAY));
        System.out.println(calc.calculatePrice(TicketDiscount.REDUCED, ValidityPeriod.ONE_RIDE));
        System.out.println(calc.calculatePrice(TicketDiscount.REDUCED, ValidityPeriod.ONE_HOUR));
        System.out.println(calc.calculatePrice(TicketDiscount.REDUCED, ValidityPeriod.ONE_DAY));
    }
}