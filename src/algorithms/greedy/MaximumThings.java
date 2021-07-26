package algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
To calculate the maximum number of things that you can do in the limited time that you have.
Let A = {5, 3, 4, 2, 1} and T = 6
output = 1+2+3 =6
 */
public class MaximumThings {
    static List<Integer> aList = new ArrayList<>();
    public static void main(String[] args) {
        Integer a[] = {5, 3, 4, 2, 1};
        int time= 15;
        aList=Arrays.asList(a);
        Collections.sort(aList);
        int noOfThings=0;
        System.out.println("Result =  "+maximumItems(0,time,0,noOfThings));

    }

    private static int maximumItems(int index,int time,int currentTime,int noOfThings) {
       if(index >= aList.size()){
           return currentTime == time?noOfThings:0;
       }
        if(currentTime == time){
            return noOfThings;
        }
       currentTime += aList.get(index);
         return   maximumItems(index+1,time,currentTime,noOfThings+1);


    }
}
