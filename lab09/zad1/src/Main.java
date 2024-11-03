public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Capybara capybara = new Capybara();
        Animal[] animals = {cat, dog, capybara};
        cat.makeSound();
        dog.makeSound();
        capybara.makeSound();
    }
}