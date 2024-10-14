public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2 ,5);
        rectangle1.sumOfSides();
        rectangle1.area();

        System.out.println();

        Rectangle rectangle2 = new Rectangle(3);
        rectangle2.sumOfSides();
        rectangle2.area();
    }
}