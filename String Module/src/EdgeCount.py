n, q = map(int, raw_input().split())
l = [[] for i in range(n)]
jl = [];
ec = [0]*q
mvl = [False]*n
for i in range(n-1):
    jl.append(raw_input().split());
    a, b = map(int, jl[i]);
    l[a-1].append(b-1)
    l[b-1].append(a-1)
def DFS(a, vl):
    cou = 0
    s = []
    s.append(a)
    while s:
        p = s.pop();
        for i in l[p]:
            if vl[i] == False:
                vl[i] = True
                s.append(i);
                cou += 1
    return cou
def DFSRec(a,vl):
    vl[a] = True
    cou = 0
    for i in l[a]:
        if vl[i] == False:
            vl[i] = True
            cou += DFSRec(i, vl)+1
    return cou
for i in range(q):
    vl = [False]*n
    e = int(raw_input())
    e1, e2 = map(int, jl[e-1]);
    vl[e1-1] = True;
    vl[e2-1] = True;
    c1 = DFSRec(e1-1, vl)
    c2 = DFSRec(e2-1, vl)
    print((c1+1)*(c2+1))
    

