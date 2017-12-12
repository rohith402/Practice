
public class ExecutionClass{

	public static void main(String[] args) {
		AddSubtract as1 = new AddSubtract();
		AddSubtract as2 = new AddSubtract();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 starts");
				for(int i=0;i<100;i++) {
					System.out.println(as1.add(as2.subtract(5)));
				}
				
				System.out.println("Thread 1 ends");
			}
		});
		
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 starts");
				for(int i=0;i<100;i++) {
					System.out.println(as2.add(as1.subtract(10)));
				}
				System.out.println("Thread 2 ends");
				
			}
			
		});
		
		t2.start();
		
		/*System.out.println(as1.a);
		System.out.println(as2.a);*/
		
	}

}
