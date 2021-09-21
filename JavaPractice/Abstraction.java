package JavaPractice;

class Abs {
    private String fName;
    private String lName;

    static int counter;

    public Abs(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        counter++;
    }

    public String getfName(){
        return fName;
    }

    public void setfName(String fName){
        this.fName = fName;
    }

    public String getlName(){
        return fName;
    }

    public void setlName(String lName){
        this.lName = lName;
    }

}

public class Abstraction{
    public static void main(String[] args) {
        Abs obj = new Abs("A", "B");
        Abs obj2 = new Abs("A", "B");
        Abs obj3 = new Abs("A", "B");
        Abs ob5 = new Abs("A", "B");

        System.out.println(Abs.counter);
    }
}