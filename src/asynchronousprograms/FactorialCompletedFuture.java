package asynchronousprograms;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCompletedFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int num = 20;

		CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> {
			return factorial(num);
		});
		// or
		// Future<Long> future = executorService.submit(() -> factorial(num);
		// );
		if (!completableFuture.isDone()) {
			System.out.println("FutureTask is not finished yet...");

		}
		System.out.println("Factorial of " + num + " is " + completableFuture.get());

	}

	private static long factorial(long n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
