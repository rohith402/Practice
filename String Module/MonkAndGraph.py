n, k = map(int, raw_input().split());
l = [[] for i in range(n)]
for i in range(k):
    a, b = map(int, raw_input().split());
    l[a].append(b)
    l[b].append(a)
vl = [];
ct = 0
cl = []
s = set();
def connComp(i):
    for j in l[i]:
        if j not in s:
            s.add(j);
            del vl[j];
            connComp(j)  
for i in range(n):
    vl.append(i);
while len(s) != n:
    start = vl.pop();
    s.add(start)
    connComp(start)
    ct = len(s);
    cl.append(len(s) - sum(cl))
    
print(max(cl)-1)

    