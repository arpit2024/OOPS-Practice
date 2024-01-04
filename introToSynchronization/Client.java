package introToSynchronization;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count cnt=new Count();

        Adder add=new Adder(cnt);
        Subtractor subtract=new Subtractor(cnt);

        Thread t1= new Thread(add);
        Thread t2= new Thread(subtract);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(cnt.value);
    }
}
