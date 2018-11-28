package JavaPractice;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        /*Car t = new AbsIntTest();
        Complex c1 = new Complex(10,12);
        Complex c2 = new Complex(c1);

        Complex c3 = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        t.CarTest2();
        Car.CarTest1();*/

        /*Base b = new Derived();

        Base.baseStatic();
        System.out.println(b.hashCode());*/


        //CASTING
        /*int i = 5; long j = 10; double k = 18;
        float s = j;  */


        System.out.println(Math.random()*10);

    }
}


class Base{

    private static int stat=3;
    private int x;

    static void baseStatic(){
        System.out.println("Static method of base class");
        System.out.println("staticVar: " + stat);
    }
    Base(){
        System.out.println("Base class constructor");
        System.out.println("staticVar: " + stat);
    }

    static {
        System.out.println("Static block");
    }
}

class Derived extends Base{

    private String color;
    private String stripePattern;
    Derived(){
        this.color = "Green";
        this.stripePattern = "Zebra";
        System.out.println("Derived class constructor: ");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 7 * hash + this.color.hashCode();
        hash = 7 * hash + this.stripePattern.hashCode();
        return hash;
    }
}



class Complex {

    private double re, im;

    // A normal parametrized constructor
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // copy constructor
    Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }

    // Overriding the toString of Object class
//    @Override
//    public String toString() {
//        return "(" + re + " + " + im + "i)";
//    }
}