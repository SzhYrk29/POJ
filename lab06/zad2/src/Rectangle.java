public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public void sumOfSides() {
        System.out.println(this.a*2 + this.b*2);
    }

    public void area() {
        System.out.println(this.a*this.b);
    }
}
