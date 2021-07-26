package algorithms.divideandconqure;
/*
Fibonacci – Divide & Conquer – Top Down (No Memoization) – Recursion
 */
public class Fibonacci {
    public static void main(String[] args) {
        int term =10;
        System.out.println("Fibonacci = " + fibonacci(term));
    }

    private static int fibonacci(int term) {
        if(term <= 1 ){
            return 1;
        }
        return fibonacci( term-1)+fibonacci(term-2);
    }

}
