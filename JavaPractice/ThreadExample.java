package JavaPractice;

public class ThreadExample {
    public static void main(String[] args) {
        /*Test t1 = new Test();
        t1.start();

        Test t2 = new Test();
        t2.start();*/

        /*Thread t3 = new Thread(new Test2());
        Thread t4 = new Thread(new Test2());
        t3.start();
        t4.start();*/

        Test3 t5 = new Test3();
        t5.start();
        t5.setName("T1");
        System.out.println(t5.getName());

        Test3 t6 = new Test3();
        t6.start();

        //JOIN is used to wait till the thread execution completes and then going ahead with the subsequent steps
        //Like printing the value of COUNT variable below. Otherwise, count prints 0
        try {
            t5.join();
            t6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Test3.count);

    }
}

class Test extends Thread {

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println(Thread.currentThread().getId() + ": " + i);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Test2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println(Thread.currentThread().getId() + ": " + i);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Test3 extends Thread{
    static int count =0;
    public static synchronized void incCount(){
        count++;
    }

    public void run(){
        for(int i=0; i<1000; i++)
            incCount();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
