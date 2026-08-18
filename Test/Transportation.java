package Test;

public abstract class Transportation { 
    protected String name; 
    protected String type; 

    public Transportation(String name, String type) {
    this.name = name; 
    this.type = type; 
    }

    public String getName() {
        return this.name;
    }

    public void displayInfo() {
    System.out.println("Name : " + this.name);
    System.out.println("Type : " + this.type);
    }

    public abstract void start();
    public abstract void travel();
}