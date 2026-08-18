package Test;

public class Airplane extends Transportation implements Flyable {
    public Airplane(String name) { 
    super(name, "Airplane"); 
    }

    @Override 
    public void start() {
    System.out.println("Action : " + name + " is starting.");
    }

    @Override 
    public void travel() {
    System.out.println("Action : " + name + " is flying in the air.");
    }

    @Override 
    public void fly() {
    System.out.println(name + " can fly."); 
    }

    public void Theboy() {
    System.out.println("Action : " + name + "Breaking news! Vought International has just confirmed a horrific tragedy over the Atlantic, as Transoceanic Flight 37 has crashed into the ocean following an alleged terrorist hijacking, with Homelander and Queen Maeve reportedly arriving too late to save the passengers."); //อันนี้อุบัติเหตุของโฮมแลนด์
    }
}