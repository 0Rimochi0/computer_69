package Test;

public class Motorcycle extends Transportation { 
    public Motorcycle(String name) { 
    super(name, "Motorcycle"); 
    }

    @Override
    public void start() {
    System.out.println("Action : " + name + " is starting."); //อันนี้สตาร์ทเครื่องยนต์
    }

    @Override
    public void travel() {
    System.out.println("Action : " + name + " is traveling on the road."); //อันนี้ขับรถบนถนน
    }

    public void Caraccident() {
    System.out.println("Action : " + name + "Car went off the road."); //อันนี้รถแหกโค้ง
    }
}