package AdderSubtractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count cnt=new Count();
        Lock lock=new ReentrantLock();
        Adder add=new Adder(cnt,lock);
        Subtractor subtract=new Subtractor(cnt,lock);

        Thread t1= new Thread(add);
        Thread t2= new Thread(subtract);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(cnt.value);
    }
}
