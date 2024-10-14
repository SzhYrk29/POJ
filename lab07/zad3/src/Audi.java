public class Audi extends Car{
    private int topSpeed;

    public Audi(String color, String brand, int topSpeed) {
        super(color, brand);
        this.topSpeed = topSpeed;
    }

    @Override
    void makeNoise() {
        System.out.println("WROOOOM");
    }

    @Override
    void getInformation() {
        System.out.println("Brand: " + brand + "\nColor: " + color + "\nTop Speed: " + topSpeed);
    }
}
