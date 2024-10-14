public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    void animal() {
        System.out.println(name + ", " + color);
    }

    @Override
    void makeSound() {
        System.out.println("cat sound");
    }
}
