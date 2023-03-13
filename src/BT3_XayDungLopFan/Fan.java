package BT3_XayDungLopFan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean ON_OFF = false;
    double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setON_OFF(boolean ON_OFF) {
        this.ON_OFF = ON_OFF;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isON_OFF() {
        return ON_OFF;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean ON_OFF, double radius, String color) {
        this.speed = speed;
        this.ON_OFF = ON_OFF;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (ON_OFF) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }
}
