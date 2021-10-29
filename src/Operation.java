import java.util.concurrent.ThreadPoolExecutor;

public class Operation implements Runnable {

    private int id;


    public Operation (int id){
        this.id = id;
    }


    @Override
    public void run() {
            System.out.println("Performing operation " + id + " in thread number " + Thread.currentThread().getId() + ".");

            try {
                if (id == 1){
                    Thread.sleep(500);
                }
                else if(id == 5){
                    Thread.sleep(4700);
                }
                else Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Operation " + id + " finished. Thread number " + Thread.currentThread().getId() + " released." );

    }


}
