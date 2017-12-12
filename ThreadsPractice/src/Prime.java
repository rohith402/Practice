import java.util.ArrayList;
import java.util.List;

public class Prime {
	
	List<Integer> ls = new ArrayList<>(1000);
	
	public  void checkPrime(int i) {
		if(i == 1) {
			putNum(i);
		} else {
			boolean flag = true;
			for(int j=2; j<=i/2; j++)
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
	
	public void putNum(int n) {
		ls.add(n);
	}
	
	public static void main(String[] arg) {
		long startTime = System.currentTimeMillis();
		Prime t = new Prime();
		for(int i=1; i< 10000; i++) {
			t.checkPrime(i);
		}
		//t.size();
		System.out.println(t.ls);
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime - startTime);
	}

}
