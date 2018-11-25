package JavaPractice;

public class AbstractVsInterface {
    public static void main(String[] args) {
        /*Shape s ;
        s = new Shape();
        s.draw();

        Circle c;
        c = new Circle();
        c.draw();*/


        /**
         * Runtime Polymorphism: The same method draw() with same ref variable s
         * we are able to draw different shapes.
         *
         * We will never need to create an object of Shape as it is meaningless.
         * All the objects created should be either Circle, Rectangle or Polygon as these are real shapes.
         *
         * Hence, we can make the class Shape as abstract.
         */

        /*Shape s;
        s = new Circle();   //Polymorphic Statement.
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Polygon();
        s.draw();*/

        Parent par = new Child();
        Child child = new Child();

        par.foo();
        par.bar();

        child.foo();
        child.bar();
    }
}

/*class Shape{
    Shape(){
        System.out.println("Shape is constructed");
    }

    abstract void draw(){
        System.out.println("Shape is drawn");
    }
}*/

/*//A way to achieve Runtime Polymorphism
abstract class Shape{
    Shape(){ //We cannot create an object of this class now as this is now abstract, but runtime env can.
        System.out.println("Shape is constructed");
    }

    abstract void draw();    //overriding: child needs to define this. MANDATORY
}*/

//More stronger kind of
interface Shape{
    /*Shape(){ //Error: as neither we nor the runtime env can create objects of an interface.
        System.out.println("Shape is constructed");
    }*/

    void draw();    //by default it is public abstract void draw()
}

class Circle implements Shape/*extends Shape*/{ //object to object inheritance when extending but not in interface
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Shape/* extends Shape*/{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Polygon implements Shape/*extends Shape*/{
    public void draw(){
        System.out.println("Drawing a Polygon");
    }
}

class Parent{
    public static void foo(){
        System.out.println("foo in super");
    }
    public void bar(){
        System.out.println("bar in super");
    }
}

class Child extends Parent{
    public static void foo(){
        System.out.println("foo in child");
    }
    public void bar(){
        System.out.println("bar in child");
    }
}