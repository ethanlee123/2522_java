package threading;
  // Static classes MUST be inner classes
  // can be accessed w/o instantiating outer class
  // no access to outer class members
class Counter {
  static int count;
  void inc() {
    count = count+1;
  }
  static int getCount() {
      return count;
  }
}
// ThreadSafeCounter.Counter counter = new ThreadSafeCounter.Counter();
class IncreamentorThread extends Thread {
  Counter counter;
  IncreamentorThread(Counter counter) {
    this.counter = counter;
  }
  @Override
  public void run() {
    synchronized (counter) {
      for (int i = 1; i <= 1000; i++) {
        // System.out.println("thread 1 counter: " + counter.getCount());
        counter.inc();
      }
    }
  }
}
public class ThreadSafeCounter {

  public static void main(String[] args) {
    Counter counter = new Counter();
    IncreamentorThread threadOne = new IncreamentorThread(counter);
    IncreamentorThread threadTwo = new IncreamentorThread(counter);
    IncreamentorThread threadThree = new IncreamentorThread(counter);
    threadOne.start();

    threadTwo.start();

    threadThree.start();

    try { // wait for threads to finish running
      Thread.sleep(3000);
      System.out.println("Counter: " + Counter.getCount());
    } catch (InterruptedException e) {
      System.out.println("error");
    }
  }
}
// ### opt 1: use join() ###
// threadOne.start();
// try { // wait for threads to finish running
//   threadTwo.join();
// } catch (InterruptedException e) {
//   System.out.println("error");
// }
// threadTwo.start();
// try { // wait for threads to finish running
//   threadThree.join();
// } catch (InterruptedException e) {
//   System.out.println("error");
// }
// threadThree.start();

// ### OPTION 2: synchronized keyword ###
// synchronized static void inc() {
//   count = count+1;
// }

// ### OPTION 3: synchronized (counter) {} keyword ###
// Counter counter;
// IncreamentorThread(Counter counter) {
//   this.counter = counter;
// }
// @Override
// public void run() {
//   synchronized (counter) {
//     for (int i = 1; i <= 1000; i++) {
//       // System.out.println("thread 1 counter: " + counter.getCount());
//       counter.inc();
//     }
//   }
// }