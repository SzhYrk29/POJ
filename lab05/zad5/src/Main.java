public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 15);
        Fraction fraction2 = new Fraction(5, 9);

        fraction1.multiplication(fraction2);
        fraction1.skrocenie();
        System.out.println(fraction1);
    }
}