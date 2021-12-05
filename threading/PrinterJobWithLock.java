package threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrinterQueue {
  private final Lock queueLock = new ReentrantLock();
  public void printJob(Object document) {
    queueLock.lock();
    try {
      System.out.println(Thread.currentThread().getName() + ": printing job ");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.printf("%s: the doc is done printing\n", Thread.currentThread().getName());
      queueLock.unlock();
    }
  }
}
class PrintingJob implements Runnable {
  private PrinterQueue printerQueue;
 
  public PrintingJob(PrinterQueue printerQueue) {
     this.printerQueue = printerQueue;
  }
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + 
                       " going to print doc");
    printerQueue.printJob(new Object());
  }
}
public class PrinterJobWithLock {
  public static void main(String[] args) {
     PrinterQueue printerQueue = new PrinterQueue();
     Thread thread[] = new Thread[10];
     for (int i = 0; i < 10; i++) {
        thread[i] = new Thread(new PrintingJob(printerQueue), "Thread " + i);
     }
     for (int i = 0; i < 10; i++) {
        thread[i].start();
     }
  }
}
