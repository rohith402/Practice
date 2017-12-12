from _collections import deque
edges = [[1,2,3],[0,4],[0,3],[0,2,4],[1,3]];
weights = [[1,1,0],[1,0],[0,0],[0,0,0],[0,0]];
ini = float('inf');
s = 0;
index = s;
count = 0;
foundNode = False;
d = deque();
d.append(s);
dis = [ini, ini, ini, ini, ini];
dis[s] = 0;
while d:
    v = d.popleft();
    for i in range(len(edges[v])):
        if (dis[edges[v][i]] > dis[v] + weights[v][i]):
            dis[edges[v][i]] = dis[v] + weights[v][i];
            if(weights[v][i] == 0):
                d.appendleft(edges[v][i]);
            else:
                d.append(edges[v][i]);
print(dis);