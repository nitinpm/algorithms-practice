package JavaPractice;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        Pizza p = new Pizza();

        Producer producer = new Producer(p);
        Consumer consumer = new Consumer(p);

        producer.start();
        consumer.start();

    }
}

class Pizza{
    Queue<Integer> pizzaQueue;

    Pizza(){
        pizzaQueue = new ArrayBlockingQueue<>(10);
    }
}

class Producer extends Thread{
    private Pizza p;

    Producer(Pizza p){
        this.p = p;
    }

    private void produce() throws InterruptedException {
        synchronized (p){
            if(p.pizzaQueue.size() < 10) {
                int x = (int)(Math.random()*10);
                p.pizzaQueue.add(x);
                Thread.sleep(2000);
                p.notify();
                System.out.println("produced: " + x);
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer extends Thread{
    private Pizza p;

    Consumer(Pizza p){
        this.p = p;
    }

    private void consume() throws InterruptedException {
        synchronized (p){
            if(p.pizzaQueue.isEmpty()) {
                p.wait();
                System.out.println("Consumer Waiting....");
            }
            else {
                System.out.println("CON " + p.pizzaQueue.remove());
                Thread.sleep(1000);
            }
        }
    }


    @Override
    public void run() {
        while(true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}