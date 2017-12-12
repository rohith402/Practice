
public class AddSubtract {
	
	int a = 0;
	
	public synchronized int add(int i) {
		a += i;
		return a;
	}
	
	public synchronized int subtract(int i) {
		a -= i;
		return a;
	}
	
	public static void main(String[] args) {
		AddSubtract as1 = new AddSubtract();
		AddSubtract as2 = new AddSubtract();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 starts");
				for(int i=0;i<100;i++) {
					System.out.println(as1.add(as2.subtract(5)));
				}
				System.out.println("Thread 1 ends");
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 starts");
				for(int i=0;i<100;i++) {
					System.out.println(as2.add(as1.subtract(10)));
				}
				System.out.println("Thread 2 ends");
			}
		}).start();;
	}
}
