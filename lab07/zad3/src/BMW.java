public class BMW extends Car {
    private int doors;

    public BMW(String color, String brand, int doors) {
        super(color, brand);
        this.doors = doors;
    }

    @Override
    void makeNoise() {
        System.out.println("WROOOOM");
    }

    @Override
    void getInformation() {
        System.out.println("Brand: " + brand + "\nColor: " + color + "\nNumber of doors: " + doors);
    }
}
