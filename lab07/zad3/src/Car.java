public abstract class Car {
    protected String color;
    protected String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    abstract void getInformation();

    abstract void makeNoise();
}
