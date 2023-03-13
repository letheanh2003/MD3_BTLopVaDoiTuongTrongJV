package BT1_XayDungLopQuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }
    // cách 2:
    // getroot  deltal > 0 --> in ra hai nghiem
    // delta = 0 in ra nghiem -b/2a
    // delta < 0 in ra vô nghiệm
    public void getRoot() {
        if (getDiscriminant() > 0) {
            double n1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            double n2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            System.out.println("Nghiệm 1 là: " + n1);
            System.out.println("Nghiệm 2 lá: " + n2);
        } else if (getDiscriminant() == 0) {
            double n3 = -b / (2 * a);
            System.out.println("nghiệm 3 là: " + n3);
        } else {
            System.out.println("Vô Nghiệm");
        }
    }
// cách 1:
//    public double getRoot1() {
//        if (getDiscriminant() >= 0) {
//            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
//        } else {
//            return 0;
//        }
//    }
//
//    public double getRoot2() {
//        if (getDiscriminant() >= 0) {
//            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
//        } else {
//            return 0;
//        }
//    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
