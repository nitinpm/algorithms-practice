package JavaPractice;

public class DependencyInjection {
    public static void main(String[] args) {
        Empl e1 = new Empl();
        //HIGH Coupling as Address is created inside Empl.

        Address a = new Address();

        //DEPENDENCY Reduced by using below

        //CONS Injection
        Empl e2 = new Empl(a);

        //Setter Injection
        Empl e3 = new Empl();
        e3.setAdrs(a);
    }
}

class Empl{
    int id;
    String name;
    int salary;
    Address adrs;

    Empl(){
        id = 101;
        name = "John";
        salary = 10000;
        adrs = new Address();
    }

    Empl(Address a){
        adrs = a;
    }

    void setAdrs(Address a){
        adrs = a;
    }
}

class Address{
    String street;
    String city;
    String state;
    int zipCode;
}
