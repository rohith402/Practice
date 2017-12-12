n, m, k = map(int,raw_input().split())
val = [int(i) for i in raw_input().split()]
graph = [[] for i in range(n)];
for i in range(m):
    a, b = map(int,raw_input().split());
    a = a-1
    b = b-1;
    graph[a].append(b)
    graph[b].append(a);
for i in range(n):
    if len(graph[i]) < k:
        print('-1');
    else:
        graph[i].sort(reverse=True)
        graph[i].sort(reverse=True,key=lambda x : val[x])
        print(graph[i][k-1]+1)
        