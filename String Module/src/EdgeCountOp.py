n, q = map(int, raw_input().split())
l = [[] for i in range(n)]
jl = [];
vl = [False]*n
numberOfChild = [0]*n
for i in range(n-1):
    jl.append(raw_input().split());
    a, b = map(int, jl[i]);
    l[a-1].append(b-1)
    l[b-1].append(a-1)
def DFS(a, vl):
    vl[a] = True
    cnt = 0
    for i in l[a]:
        if vl[i] == False:
            vl[i] = True
            cnt += DFS(i, vl)+1
    numberOfChild[a] = cnt;
    return cnt
DFS(0, vl)
for i in range(q):
    e = int(raw_input())
    e1, e2 = map(int, jl[e-1]);
    child = 0
    if(numberOfChild[e1-1] < numberOfChild[e2-1]):
        child = e1-1
    else:
        child = e2-1
    print((numberOfChild[child]+1)*(n-numberOfChild[child]-1))
    
    