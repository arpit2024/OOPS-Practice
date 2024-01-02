package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService executer= Executors.newFixedThreadPool(10);
        //Created an executor service of Thread pool size 10

        //Dynamic Thread pool
        ExecutorService executer= Executors.newCachedThreadPool();
        for(int i=1;i<=100;i++){

            if(i==5||i==11||i==20||i==50){
                System.out.println("DEBUG");
            }
            //we are creating a task for every number of hw
            //i want to print 1....create a task
            //i want to print 2....create a task
            HelloWorld hw=new HelloWorld(i);

            //lets execute a task via executor.
//            System.out.println("the thread count is.."+i+);
            executer.execute(hw);
        }
        executer.shutdown();

    }
}

