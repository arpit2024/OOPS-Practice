package Threads;

public class Client {
    public static void main(String[] args){
        System.out.println("Hello World from main..."+Thread.currentThread().getName());



         for(int i=0;i<=100;i++){
             HelloWorld hwc=new HelloWorld();
             Thread t=new Thread(hwc);
             t.start();
         }
    }
}
