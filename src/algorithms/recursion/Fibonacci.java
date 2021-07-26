package algorithms.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int term =4;
        System.out.println("Fibonacci = " + fibonacci(term));
    }

    private static int fibonacci(int term) {
        if(term <= 1 ){
            return 1;
        }
        return fibonacci( term-1)+fibonacci(term-2);
    }


}
