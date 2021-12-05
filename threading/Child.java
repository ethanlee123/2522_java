package threading;

class Child extends Thread{
	public static int presents = 1;
	public static boolean getGift(){
		if (presents >= 1){
			try {
				Thread.sleep(3000);
				presents--;
			} catch(InterruptedException e) {

			}
			return true;
		}else
			return false;
	}
	public void run(){
		if (getGift())
			System.out.println("got a gift and there are " +presents+ "presents left");
	}
	public static void main(String[] args){
		Child c1 = new Child();
		Child c2 = new Child();
		c1.start();
		c2.start();
		try {
			c1.join(); //join() should be an try catch, will throw compile error if there is code after such as "done main"
			c2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    // Thread.join(); // main thread?
		System.out.println("done main");
	}
}

