package Test;

public class Train extends Transportation { 
    public Train(String name) { 
    super(name, "Train"); 
    }

    @Override 
    public void start() {
    System.out.println("Action : " + name + " is starting."); //อันนี้สตาร์ทเครื่องยนต์รถไฟ
    }

    @Override 
    public void travel() {
    System.out.println("Action : " + name + " is traveling on the railway."); //กำลังวิ่งบนรางรถไฟ
    }

    public void invincible() {
    System.out.println("Action : " + name + "Breaking news! A catastrophic disaster has struck the subway line as a high-speed train completely derailed and disintegrated after Omni-Man forcefully held Invincible in its path, resulting in mass casualties with zero baseline survivors from the impacted cars."); //อันนี้ออมนิแมนจับอินวินซิเบิลแล้วรถไฟชนกัน
    }
}