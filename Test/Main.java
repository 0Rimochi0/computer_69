package Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("----TRAVEL INFORMATION----\n");

        //Polymorphism: รวมทุกประเภทยานพาหนะไว้ใน Array ชนิดคลาสแม่ (Transportation) ไว้อ่านตอนตรวจ 5555
        Transportation[] travels = new Transportation[] {
            new Motorcycle("Auto Vajin"),
            new Train("DenLiner"),
            new Airplane("Hell Airline")
        };

        // วนลูปสั่งงานผ่าน Polymorphism (Dynamic Binding) 
        for (int i = 0; i < travels.length; i++) {
            Transportation t = travels[i];
            
            t.displayInfo();
            System.out.println();
            t.start();
            t.travel();

            // เรียกเมธอดเฉพาะตัวของ Motorcycle โดยใช้ instanceof และ Downcasting
            if (t instanceof Motorcycle) {
                ((Motorcycle) t).Caraccident();
            }

            // เรียกเมธอดเฉพาะตัวของ Train โดยใช้ instanceof และ Downcasting
            if (t instanceof Train) {
                ((Train) t).invincible();
            }

            // เรียกเมธอดเฉพาะตัวของ Airplane โดยใช้ instanceof และ Downcasting
            if (t instanceof Airplane) {
                ((Airplane) t).Theboy();
            }

            if (i < travels.length - 1) {
                System.out.println("-----------------------------------");
            }
        }

        //แสดงการตรวจหาความสามารถเฉพาะ (Interface)
        System.out.println("\n---- FLYING VEHICLES ----");
        for (Transportation t : travels) {
            if (t instanceof Flyable) {
                ((Flyable) t).fly();
            }
        }
    }
}