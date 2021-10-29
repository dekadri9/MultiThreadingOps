public class Operation implements Runnable {

    private int id;


    public Operation (int id){
        this.id = id;
    }


    @Override
    public void run() {
            System.out.println("Performing operation " + id + " in thread number " + Thread.currentThread().getId() + ".");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Operation " + id + " finished.");

    }


}
