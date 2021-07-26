package asynchronousprograms;

public class FactorialThreadClass {

	public static void main(String[] args) {
		int num = 20;
		Thread thread = new Thread(() -> {
			System.out.println("Thread Name" + Thread.currentThread());
			System.out.println("Factorial of " + num + " is " + factorial(num));
		});
		thread.start();
	}

	private static long factorial(long n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
