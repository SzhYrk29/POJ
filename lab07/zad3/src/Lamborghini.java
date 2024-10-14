public class Lamborghini extends Car {
    private int wheels;

    public Lamborghini(String color, String brand, int wheels) {
        super(color, brand);
        this.wheels = wheels;
    }

    @Override
    void makeNoise() {
        System.out.println("WROOOOM");
    }

    @Override
    void getInformation() {
        System.out.println("Brand: " + brand + "\nColor: " + color + "\nNumber of wheels: " + wheels);
    }
}
