public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("Black", "BMW", 4);
        Audi audi = new Audi("White", "Audi", 290);
        Lamborghini lamborghini = new Lamborghini("Red", "Lamborghini", 4);

        Car[] cars = new Car[3];
        cars[0] = bmw;
        cars[1] = audi;
        cars[2] = lamborghini;

        for (Car car : cars) {
            car.getInformation();
            car.makeNoise();
            System.out.println();
        }
    }
}