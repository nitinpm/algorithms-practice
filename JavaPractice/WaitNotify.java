package JavaPractice;

public class WaitNotify {

    public static void main(String[] args) throws InterruptedException {
        ThreadA b = new ThreadA();
        b.start();
        synchronized (b){
            System.out.println("Main thread trying to call WAIT() method.");
            b.wait();

            System.out.println("Main thread got the NOTIFICATION");
            System.out.println("Total = " + b.total);
        }
    }
}

class ThreadA extends Thread{

    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread starts calculation");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread trying to give NOTIFY().");
            this.notify();
        }
    }
}
