package JavaPractice;

public class EqualsVs2EqualOp {
    public static void main(String[] args) {

        String str1 = new String("Hello"); //str1 is a ref var. it is having the address of an object.
        String str2 = new String("Hello"); //str2 is a ref var. it is having the address of an object.

        if(str1 == str2) //comparing references
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");


        if(str1.equals(str2)) //comparing the values withing the objects
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 != str2");
    }
}
