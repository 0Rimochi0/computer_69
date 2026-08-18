package week7;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        dog.makeSound();
        dog.eat();
        dog.run();

        Cat cat = new Cat("jiejie");
        cat.makeSound();
        cat.eat();
        cat.scratch();

        Bird bird = new Bird("wehaa");
        bird.makeSound();
        bird.eat();
        bird.fly();
    }
    
}
