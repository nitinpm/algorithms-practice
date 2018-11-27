package JavaPractice;

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread k = new MyThread();
        k.start();
        k.setPriority(1);

        for (int i = 0; i < 10; i++) {
            System.out.println(("Parent Thread"));
        }
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(("Child Thread"));
        }
    }
}
