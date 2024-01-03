package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> arrToSort;

    MergeSorter(List<Integer> arrToSort){
        this.arrToSort=arrToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size()<=1){
            System.out.println("DEBUG");
            // a debug point was used here to check how many thread was
            // used while running the code without executor(so only main was used)
            return arrToSort;
        }

        int mid=arrToSort.size()/2;
        ArrayList<Integer> leftArr=new ArrayList<>();
        ArrayList<Integer> rightArr=new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrToSort.get(i));
        }

        for(int i=mid;i<arrToSort.size();i++){
            rightArr.add(arrToSort.get(i));
        }
        // creating MergeSorter objects to call the call Method.
        MergeSorter leftMergeSorter=new MergeSorter(leftArr);
        MergeSorter rightMergeSorter=new MergeSorter(rightArr);

        List<Integer> leftSortedArray=leftMergeSorter.call();
        List<Integer> rightSortedArray=rightMergeSorter.call();


        List<Integer> sortedArray=new ArrayList<>();

        //Merging Two Sorted lists starts from here
        int i=0,j=0;
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }

}
