package MergeSort;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {

        List<Integer> arrtoSort= List.of(4,3,2,7,6,1,5,8);
    // Create a task
        MergeSorter mergeSorter =new MergeSorter(arrtoSort);
        List<Integer> sortedArray=mergeSorter.call();

        System.out.println(sortedArray);
    //so here we run and check the code once, which executed successfull
    //Also checked with DEBUG too for thread count check

    //so now we need to create threads/we can use framework to easily manage threads.
    //so lets use executor Service
        ExecutorService executor= Executors.newCachedThreadPool();
    //since we have checked with debug and got to know only one main theread was used
    //so lets use executor service.....for this we don't have to call method manually like in line no 15


    }

}
