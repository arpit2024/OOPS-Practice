package MergeSort;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

        List<Integer> arrayToSort= List.of(4,3,2,7,6,1,5,8);

        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arrayToSort, executor);

        //List<Integer> sortedArray = mergeSorter.call();
        Future<List<Integer>> sortedArrayFuture = executor.submit(mergeSorter);

        List<Integer> sortedArray = sortedArrayFuture.get();
        System.out.println(sortedArray);

        executor.shutdown();
    /*
        // Create a task
        MergeSorter mergeSorter =new MergeSorter(arrtoSort);
        List<Integer> sortedArray=mergeSorter.call();


    //so here we run and check the code once, which executed successfull
    //Also checked with DEBUG too for thread count check

    //so now we need to create threads/we can use framework to easily manage threads.
    //so lets use executor Service
        ExecutorService executor= Executors.newCachedThreadPool();
    //since we have checked with debug and got to know only one main theread was used
    //so lets use executor service.....for this we don't have to call method manually like in line no 15

        Future<List<Integer>> sortedArrayFuture=executor.submit(mergeSorter);
        List<Integer> sortedArrayget=sortedArrayFuture.get();

        System.out.println(sortedArray);

     */
    }

}
