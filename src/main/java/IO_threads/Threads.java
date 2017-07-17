package IO_threads;

/**
 * Created by nicola on 7/17/17.
 */

/**
*create a thread object that implements Runnable and call it from a main()
*create a thread object that extends Thread and call it from main()
*start 5 threads with each implementation
*in each thread, print out the name of the thread
*/
public class Threads implements Runnable{
    int sleep;
    Thread myThread;


    Threads(String name, int sleep){
        myThread = new Thread (this, name);
        this.sleep = sleep;
        myThread.start();
    }


    public void run(){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myThread.getName());
    }

}
