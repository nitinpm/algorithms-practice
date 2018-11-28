package JavaPractice;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MySyncThread t1 = new MySyncThread(d, "Dhoni");
        MySyncThread t2 = new MySyncThread(d, "Yuvraj");
        MySyncThread t3 = new MySyncThread(d, "Kohli");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Display{
    public synchronized void wish(String name){
        for (int i = 0; i < 5; i++) {

            System.out.print("Good Morning: ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);

        }
    }
}


class MySyncThread extends Thread{
    Display d;
    String name;

    public MySyncThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }

}


