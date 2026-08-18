package week7;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.err.println(name + " says Woof Woof!");
    }

    public void run() {
        System.out.println(name + " is running.");
    }
    
}
