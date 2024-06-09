/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

public class Rectangle {
    private double Lnth;
    private double wid;

    public Rectangle(double length, double width) {
        this.Lnth = length;
        this.wid = width;
    }
    public double Perimetercalculate() {
        return 2 * (Lnth + wid);
    }
    public double Areacalculate() {
        return Lnth * wid;
    }
    public void displayDetails() {
        System.out.println("The Length is = " + Lnth);
        System.out.println("The Width is = " + wid);
        System.out.println("The Perimeter is = " + Perimetercalculate());
        System.out.println("The Area is = " + Areacalculate());
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(40.2, 20.5);
        Rectangle r2 = new Rectangle(70.3, 30.3);
        Rectangle r3 = new Rectangle(20.3, 10.3);

        System.out.println("1st Rectangle =");
        r1.displayDetails();
        System.out.println("\n 2nd Rectangle =");
        r3.displayDetails();
        System.out.println("\n 3nd Rectangle =");
        r3.displayDetails();
    }
}
