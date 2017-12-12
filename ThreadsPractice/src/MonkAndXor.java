import java.io.*;
    import java.util.*;
    public final class MonkAndXor
    {
        static BufferedReader br;
    	static FastScanner sc;
        static PrintWriter out;
    	static Random rnd=new Random();
    	static ArrayList<Integer>[] al;
    	static int[] a,cnt;
    	static int maxn=(int)(1<<21)+3,n,k;
    	static long res=0;
    	
    	static void dfs(int u,int p,int xor)
    	{
    		xor^=a[u];res=res+cnt[xor^k];cnt[xor]++;
    		for(int x:al[u])
    		{
    			if(x!=p)
    			{
    				dfs(x,u,xor);
    			}
    		}
    		cnt[xor]--;
    	}
    	
    	static void init() throws Exception
    	{
    		br=new BufferedReader(new InputStreamReader(System.in));
    		sc=new FastScanner(br);
    		out=new PrintWriter(System.out);
    	}
    	
    	@SuppressWarnings("unchecked")
    	public static void run() throws Exception
    	{
    		init();n=sc.nextInt();k=sc.nextInt();a=new int[n];al=new ArrayList[n];
			assert n>=1 && n<=(int)1e5;
			assert k>=0 && k<=(1<<20);
    		for(int i=0;i<n;i++)
    		{
    			a[i]=sc.nextInt();al[i]=new ArrayList<Integer>();
				assert a[i]>=0 && a[i]<=(1<<20);
    		}
    		for(int i=1;i<n;i++)
    		{
    			int u=sc.nextInt()-1,v=i;
    			al[u].add(v);al[v].add(u);
				assert u<i;
    		}
    		cnt=new int[maxn];cnt[0]=1;dfs(0,-1,0);
    		out.println(res);out.close();
    	}
    	
        public static void main(String args[]) throws Exception
        {
    		new Thread(null,new Runnable(){
    			public void run()
    			{
    				try
    				{
    					new MonkAndXor().run();
    				}
    				catch(Exception e)
    				{
    					
    				}
    			}
    		},"1",1<<26).start();
        }
    }
    class FastScanner
    {
        BufferedReader in;
        StringTokenizer st;
     
        public FastScanner(BufferedReader in) {
            this.in = in;
        }
    	
        public String nextToken() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        }
    	
    	public String next() throws Exception {
    		return nextToken().toString();
    	}
    	
        public int nextInt() throws Exception {
            return Integer.parseInt(nextToken());
        }
     
        public long nextLong() throws Exception {
            return Long.parseLong(nextToken());
        }
     
        public double nextDouble() throws Exception {
            return Double.parseDouble(nextToken());
        }
    }