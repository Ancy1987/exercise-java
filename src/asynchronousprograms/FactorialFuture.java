package asynchronousprograms;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int num = 20;
		
		ExecutorService executorService = Executors.newCachedThreadPool();

		Future<Long> future = executorService.submit(() -> {
			return factorial(num);
		});
		// or
		// Future<Long> future = executorService.submit(() -> factorial(num);
		// );
		if (!future.isDone()) {
			System.out.println("FutureTask is not finished yet...");

		}
		System.out.println("Factorial of " + num + " is " + future.get());

	}

	private static long factorial(long n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
