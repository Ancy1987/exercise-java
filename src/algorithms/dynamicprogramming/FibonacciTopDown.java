package algorithms.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/*
Fibonacci – Dynamic Programming – Top Down (Memoization) – Recursion

 */
public class FibonacciTopDown {
    static Map<Integer,Integer> fibMap = new HashMap<>();
    public static void main(String[] args) {
        int term =9;
        fibMap.put(1,1);
        fibMap.put(2,1)       ;
        System.out.println("Fibonacci = " + fibonacci(term));
    }

    private static int fibonacci(int term) {
        if(term <1){
            return 1;
        }
        if(fibMap.containsKey(term)){
            return fibMap.get(term);
        }else {
            fibMap.put(term, fibonacci(term - 1) + fibonacci(term - 2));
        }
        return fibMap.get(term);
    }
}
