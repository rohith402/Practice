from _collections import deque
dist = [];
n = 5;
for j in range(n):
    dist.append(float('inf'));
    
s = 0;
dist[s] = 0;
d = deque();
d.appendleft(s);
edges = [[0,1,1,1,0],[1,0,0,0,1,0],[1,0,0,1,0],[1,0,1,0,1],[0,1,0,1,0]];
weights = [[0,1,1,0,0],[1,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]];
while d:
    v = d.popleft();
    for i in range(n):
           if(dist[ edges[ v ][ i ] ] > dist[ v ] + weights[ v ][ i ] ):
                dist[ edges[ v ][ i ] ] = dist[ v ] + weights[ v ][ i ];
                if(weights[ v ][ i ] == 0):
                    d.appendleft( edges[ v ][ i ]);
                else:
                    d.append( edges[ v ][ i ]);
print(dist);
                