public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Richard", "Whatever");
        Dog dog = new Dog ("Bright", "Black and brown");

        cat.animal();
        cat.makeSound();
        dog.animal();
        dog.makeSound();
    }
}