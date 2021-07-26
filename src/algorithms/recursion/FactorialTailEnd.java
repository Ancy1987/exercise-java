package algorithms.recursion;

public class FactorialTailEnd {
    public static void main(String[] args) {
        int a= 5;
        System.out.println("Factorial = "+fact(a,1));
    }

    private static int fact(int number, int product) {
        if(number==0){
            return product;
        }
        return fact(number-1,product * number);
    }
}
