public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Square's total field: " + square.totalField());
        System.out.println("Sum of square's edges: " + square.sumOfEdges());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle's total field: " + rectangle.totalField());
        System.out.println("Sum of rectangle's edges: " + rectangle.sumOfEdges());

        Cuboid cuboid = new Cuboid(2, 3, 4);
        System.out.println("Cuboid's total field: " + cuboid.totalField());
        System.out.println("Sum of cuboid's edges: " + cuboid.sumOfEdges());
        System.out.println("Cuboid's volume: " + cuboid.volume());

        Cube cube = new Cube(2);
        System.out.println("Cube's total field: " + cube.totalField());
        System.out.println("Sum of cube's edges: " + cube.sumOfEdges());
        System.out.println("Cube's volume: " + cube.volume());
    }
}