package JavaPractice;

public interface Car {
    static void CarTest1(){
        System.out.println("Static method in an Interface");
    }

    default void CarTest2(){
        System.out.println("Default method in an Interface");
    };
}
