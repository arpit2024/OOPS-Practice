package Threads;

public class Client {
    public static void main(String[] args){
        System.out.println("Hello World from main..."+Thread.currentThread().getName());


    //Task: Run a print statement 100 times where each task should be done by a new thread.
         for(int i=0;i<=100;i++){
             HelloWorld hwc=new HelloWorld();//creating the object of the task(class)
             //which we need to run in a different thread
             //putting it under for loop so that it can create a new thread everytime
             Thread t=new Thread(hwc);//Passing a task to thread which it will have to run
             t.start();
         }
    }
}
