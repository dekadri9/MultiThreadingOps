import java.util.concurrent.*;

public class MultiThreadingOperations {
    public static void main (String[] args) throws InterruptedException {

        //Initializing all 5 operations with their IDs
        Operation op1 = new Operation(1);
        Operation op2 = new Operation(2);
        Operation op3 = new Operation(3);
        Operation op4 = new Operation(4);
        Operation op5 = new Operation(5);

        //Building a 3 thread Pool Executor to manage our threads
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        //Begin the execution of operations that have no dependencies
        Future<?> t1 = executor.submit(op1);
        Future<?> t2 = executor.submit(op2);
        Future<?> t3 = executor.submit(op5);

        try {
            //Getting operations 1 and 2 and waiting for
            //them to finish before we start the operation 3
            t1.get();
            t2.get();

            //Start operation 3 with a free thread of the pool
            t1 = executor.submit(op3);

            //Wait for operation 3 to finish
            t1.get();

            //Start operation 4 with another free thread
            t1 = executor.submit(op4);

            //Making sure that every operation finished before
            //shutting down the executor
            t1.get();
            t3.get();

            //Shutting down executor
            executor.shutdown();

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
