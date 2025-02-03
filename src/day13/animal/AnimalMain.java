package day13.animal;

public class AnimalMain {

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.meow();
        c.eat();
        d.bark();
        d.eat();
    }
}
