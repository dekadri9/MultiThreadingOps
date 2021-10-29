public class Operation implements Runnable {

    //Operation identifier
    private int id;

    //Operation constructor
    public Operation (int id){
        this.id = id;
    }

    //Override of Runnable function run()
    @Override
    public void run() {

            //Inform user that some operation is performing and which thread is doing it
            System.out.println("Performing operation " + id + " in thread number " + Thread.currentThread().getId() + ".");

            try {
                //Giving different "operation time" to some operations
                //in order to see if constraints are met
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

            //Inform user about operation finishing and the release of its thread
            System.out.println("Operation " + id + " finished. Thread number " + Thread.currentThread().getId() + " released." );

    }


}
