package IO_threads;

/**
 * Created by nicola on 7/17/17.
 */
public class ThreadsMain {
    public static void main(String[] args) {
        Threads obj1 = new Threads("Name 1",1000);
        Threads obj2 = new Threads("Name 2",2000);
        Threads obj3 = new Threads("Name 3",3000);
        Threads obj4 = new Threads("Name 4", 4000);
        Threads obj5 = new Threads("Name 5", 5000);



        Extending objA = new Extending("Hello 1", 1500);
        Extending objB = new Extending("Hello 2",2500);
        Extending objC = new Extending("Hello 3",3500);
        Extending objD = new Extending("Hello 4",4500);
        Extending objE = new Extending("Hello 5",5500);

    }
}
