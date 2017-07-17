package IO_threads;

/**
 * Created by nicola on 7/17/17.
 */
public class Extending extends Thread {
    int sleep;

    Extending(String name, int sleep) {
        super(name);
        this.sleep = sleep;
        start();
    }
    public void run(){

        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName());
    }
}
