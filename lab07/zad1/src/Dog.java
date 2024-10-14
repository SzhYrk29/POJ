public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    void animal() {
        System.out.println(name + ", " + color);
    }

    @Override
    void makeSound() {
        System.out.println("Dog sound");
    }
}
