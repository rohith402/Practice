def DFS(l, vl, i):
    c= 0
    st = [];
    st.append(i);
    while st:
        f = st.pop()
        for j in l[f]:
            if vl[j] == False:
                st.append(j);
                vl[j] = True;
            c += 1;
            
    return c/2;


n, k = map(int, raw_input().split());
l = [[] for i in range(n)]
for i in range(k):
    a, b = map(int, raw_input().split());
    l[a-1].append(b-1)
    l[b-1].append(a-1)   
vl = [False]*n;
cl = []
cou = 0
for i in range(n):
    if vl[i] == False:
        vl[i] = True
        cl.append(DFS(l, vl, i))
print(max(cl))
    

    
