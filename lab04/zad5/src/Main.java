public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1.Information());
        System.out.println();

        Fan fan2 = new Fan(3, true, 8, "red");
        System.out.println(fan2.Information());
    }
}