import java.lang.reflect.Array;

public class MultiThreadingOperations {
    public static void main (String[] args) throws InterruptedException {

        Operation op1 = new Operation(1);
        Operation op2 = new Operation(2);
        Operation op3 = new Operation(3);
        Operation op4 = new Operation(4);
        Operation op5 = new Operation(5);

        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op5);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println("Interrupted");
        }
        t1 = new Thread(op3);
        t1.start();
        try{
            t1.join();
        } catch (Exception e){
            System.out.println("Interrupted");
        }
        t1 = new Thread(op4);
        t1.start();
        try{
            t1.join();
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
