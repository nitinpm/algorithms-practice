package JavaPractice;

abstract class AbstractClass {

    abstract void test1();

    AbstractClass(int a, int b){
        System.out.println("a + b = "+(a+b));
    }

    AbstractClass(){}

    void nonAbstractMethod(){
        System.out.println("Non- Abstract method in the Abstract Class");
    }
}
