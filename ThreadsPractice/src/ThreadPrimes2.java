import java.util.*;

public class ThreadPrimes2{
	List<Integer> ls;
	int total;
	int numsCPU;
	boolean execDone = false;
	class MyThreadPrimes extends Thread {
		private int start;
		private int end;
		private String name;
		public MyThreadPrimes(int s, int e, String threadName) {
			start = s;
			end = e;
			name = threadName;
		}
		
		@Override
		public void run() {
			for(int i = start; i<=end; i++) {
				checkPrime(i);
			}
		};
		
		public void checkPrime(int i) {
			if(i == 1) {
				putNum(i);
			} else {
				boolean flag = true;
				int limit = (int)Math.sqrt(i) + 1;
				for(int j=2; j<limit; j++)
			    {
			        if(i%j==0)
			        {
			            flag=false;
			            break;
			        }
			    }
				if(flag) {
					putNum(i);
				}
			}
		}
		
		public synchronized void putNum(int n) {
			System.out.println("Current thread:"+ Thread.currentThread().getName());
			ls.add(n);
		}
	}
	
	public ThreadPrimes2(int t, int c) {
		total = t;
		numsCPU = c;
		int s = 0;
		int e = total / numsCPU;
		ls = new ArrayList<>(1000);
		for(int i = 0; i < numsCPU; i++) {
			Thread t1 = new MyThreadPrimes(s, e, "Thread"+i);
			t1.start();
			/*try {
				t1.join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}*/
			s = e + 1;
			e += total / numsCPU;
		}
	}
	public void size() {
		System.out.println(ls.size() + "FFF");
	}
	public static void main(String[] arg) {
		ThreadPrimes2 t = new ThreadPrimes2(10000, 2);
		System.out.println(t.ls);
	}
}

