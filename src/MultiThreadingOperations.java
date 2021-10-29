import java.util.concurrent.*;

public class MultiThreadingOperations {
    public static void main (String[] args) throws InterruptedException {

        Operation op1 = new Operation(1);
        Operation op2 = new Operation(2);
        Operation op3 = new Operation(3);
        Operation op4 = new Operation(4);
        Operation op5 = new Operation(5);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        Future<?> t1 = executor.submit(op1);
        Future<?> t2 = executor.submit(op2);
        executor.submit(op5);

        try {
            t1.get();
            t2.get();

            t1 = executor.submit(op3);

            t1.get();

            executor.submit(op4);
            executor.shutdown();

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
