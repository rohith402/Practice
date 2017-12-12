n,m = map(int, raw_input().split())

w, h = 1000, 1000;
a = [[0 for x in range(w)] for y in range(h)] 
for i in range(0,n):
    a[i][i]=0
for i in range(0,m):
    l,k=map(int, raw_input().split())
    a[l][k]=1
    
for i in range(input()):
    pehla,dusra=map(int, raw_input().split())
    if(a[pehla][dusra]==1 or a[dusra][pehla]==1):
        print("YES");
    else:
        print("NO");
