package threading;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class InvokeAny {
  ExecutorService executorService = Executors.newSingleThreadExecutor();
  Set<Callable<String>> callables = new HashSet<Callable<String>>();
  public void invokeAny() throws ExecutionException {
    callables.add(new Callable<String>() {
        public String call() throws Exception {
            return "Task 1";
        }
    });
    callables.add(new Callable<String>() {
        public String call() throws Exception {
            return "Task 2";
        }
    });
    callables.add(new Callable<String>() {
        public String call() throws Exception {
            return "Task 3";
        }
    });
    try {
      String result = executorService.invokeAny(callables);
      System.out.println("result = " + result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    } finally {
      executorService.shutdown();
    }  
  }
}
public class Executor {
  
}
// http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
// CREATING EXECUTOR
// 1. ExecutorService executorService1 = Executors.newSingleThreadExecutor();
// 2. ExecutorService executorService2 = Executors.newFixedThreadPool(10);
// 3. ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
// 4. ExecutorService executorService4 = Executors.newCachedThreadPool();

// TO DELEGATE TASKS
// 1. execute(Runnable) -> executing Runnable, recall runnable provides void return
// 2. submit(Runnable) -> takes Runnable,returns null if task finishes successfully
// 3. submit(Callable) -> also returns Future object
// 4. invokeAny(...) -> takes Collection of callable. Returns result of 1 callable
  // if 1 callable finishes, then the rest of the instances are cancelled
  // if 1 task completes (or throws exception), then the rest are cancelled
// 5. invokeAll(...) -> returns list of future objects
  // List<Future<String>> futures = executorService.invokeAll(callables);

  // MAIN DIFFERENCE BETWEEN RUNNABLE AND CALLABLE
  // 1. Runnable can be executed by a thread (...new Thread(new MyRunnable());) OR by ExecutorService
  // 1. Callable can only be executed by ExecutorService
  // 2. Callable can return an Object and can throw an exception

  // EXTRA NOTES
  // 1. we can cancel a task, if not yet started: future.cancel()
  // 2. we can executorService.shutdownNow() to close tasks immediately

  // WHY USE EXECUTOR?
  // https://stackoverflow.com/questions/3984076/what-are-the-advantages-of-using-an-executorservice

  // DEEP DIVE
  // https://dzone.com/articles/a-deep-dive-into-the-java-executor-service