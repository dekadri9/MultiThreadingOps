import java.lang.reflect.Array;
import java.util.concurrent.*;

public class MultiThreadingOperations {
    public static void main (String[] args) throws InterruptedException {

        Operation op1 = new Operation(1);
        Operation op2 = new Operation(2);
        Operation op3 = new Operation(3);
        Operation op4 = new Operation(4);
        Operation op5 = new Operation(5);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        /*Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op5);*/

        Future<?> t1 = executor.submit(op1);
        Future<?> t2 = executor.submit(op2);
        executor.submit(op5);

        /*t1.start();
        t2.start();
        t3.start();*/

        try{
            /*t1.join();
            t2.join();*/
        } catch (Exception e){
            System.out.println("Interrupted");
        }

        try {
            t1.get();
            t2.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        t1 = executor.submit(op3);
        /*t1 = new Thread(op3);
        t1.start();*/
        try{
            //t1.join();
            //executor.wait();
        } catch (Exception e){
            System.out.println("Interrupted");
        }
        /*t1 = new Thread(op4);
        t1.start();*/
        try {
            t1.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.submit(op4);


        try{
            //t1.join();
            executor.shutdown();
        } catch (Exception e){
            System.out.println("Interrupted");
        }


        /*System.out.println("Operation " + op1.getId() + " was executed in thread " + op1.getThreadNumber() + "." );
        System.out.println("Operation " + op2.getId() + " was executed in thread " + op2.getThreadNumber() + "." );
        System.out.println("Operation " + op3.getId() + " was executed in thread " + op3.getThreadNumber() + "." );
        System.out.println("Operation " + op4.getId() + " was executed in thread " + op4.getThreadNumber() + "." );
        System.out.println("Operation " + op5.getId() + " was executed in thread " + op5.getThreadNumber() + "." );

         */
    }
}
