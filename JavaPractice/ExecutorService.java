package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Create the pool
        java.util.concurrent.ExecutorService service = Executors.newFixedThreadPool(10);

        //service.execute(new Task());

        List<Future> allFutures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = service.submit(new Task2());
            allFutures.add(future);
        }

        //100 Futures, with 100 placeholders (empty), which will have values sometime in future.

        //Perform some other operations (unrelated)

        /**
         * Blocking Op: as the value might not be available as call() is still executing and not returned yet.
         * future.get() - is not ready to return a value.
         *
         * If main thread calls above method when future is not yet ready, then it goes into
         * blocked state.
         */

        for (int i = 0; i < 100; i++){
            Future<Integer> future = allFutures.get(i);
            Integer result = future.get();// If we don't want to wait for too long we can use below method
            //future.get(1, TimeUnit.SECONDS); which shows TimeOutException which we can handle.
            System.out.println("Result of future #" + i + " = " + result);
        }

        System.out.println("Thread Name: "+ Thread.currentThread().getName());

        service.shutdown();
    }


    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }


    static class Task2 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }
}


