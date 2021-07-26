package algorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/*
Fibonacci – Dynamic Programming – Bottom Up (Tabulation) – Iterative (preferably) or Recursion

 */
public class FibonacciBottomUp {
    static List<List<Integer>> table = new ArrayList();
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.
    public static void main(String[] args) {
        int term =15;
        System.out.println("Fibonacci Iterative = " + fibonacciIterative(term));
        System.out.println("Fibonacci Recursive= " + fibonacciRecursive(0,term));
    }

    private static int fibonacciIterative(int term) {
       for(int i=0;i<=term;i++){
           List<Integer> fibList = new ArrayList<>();
           if(i<=1){
               fibList.add(i);
           }else{
              int value = table.get(i-1).get(0)+ table.get(i-2).get(0);
               fibList.add(value);
           }
           table.add(new ArrayList<>(fibList));
       }
        System.out.println("Fibonacci table= " + table);
       return table.get(term).get(0);
    }

    private static int fibonacciRecursive(int i, int term) {
            List<Integer> fibList = new ArrayList<>();
            if(i > term){
                return table.get(term).get(0);
            }
            if(i<=1){
                fibList.add(i);
            }else{
                int value = table.get(i-1).get(0)+ table.get(i-2).get(0);
                fibList.add(value);
            }
            table.add(new ArrayList<>(fibList));
        return fibonacciRecursive(i+1,term);
    }

}
