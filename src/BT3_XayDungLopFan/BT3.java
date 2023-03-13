package BT3_XayDungLopFan;

public class BT3 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        fan1.setON_OFF(true);
        fan1.setSpeed(3);
        fan1.setRadius(8.0);
        fan1.setColor("green");

        System.out.println(fan1.toString());
    }
}
