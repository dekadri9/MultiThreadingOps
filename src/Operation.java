public class Operation implements Runnable {

    private int id;
    private Long threadNumber;

    public int getId(){
        return this.id;
    }


    public Operation (int id){
        this.id = id;
    }

    public void setThreadNumber(Long threadNumber){
        this.threadNumber = threadNumber;
    }

    public Long getThreadNumber() {
        return threadNumber;
    }

    @Override
    public void run() {
            System.out.println("Performing operation " + id + ".");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Operation " + id + " finished.");

    }


}
