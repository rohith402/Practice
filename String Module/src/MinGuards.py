from _collections import deque
import sys
r = 6;
c = 6;
s = ['akaccc', 'aaacfc', 'amdfcc', 'aokhdd', 'zyxwdp', 'zyxwdd'];
#s = [];
d = deque();
d.append([0,0])
dis = [];
for i in range(r):
    l = [];
    #sl = [];
    for j in range(c):
        #sl.append(input())
        l.append(sys.maxint);
    dis.append(l);
    #s.append(sl);
dis[0][0] = 0;
cnt = 0
moves = [[1,0],[-1,0],[0,1], [0,-1]];
while d:
    pos = d.popleft();
    curX = pos[0];
    curY = pos[1];
    for i in moves:
        x = pos[0]+i[0]
        y = pos[1]+i[1]
        if 0<=x<r and 0<=y<c:
            if (s[curX][curY] == s[x][y]) and (dis[x][y] > dis[curX][curY]):
                d.appendleft([x, y]);
                dis[x][y] = dis[curX][curY];
            elif (s[curX][curY] != s[x][y] ) and (dis[x][y] > dis[curX][curY]):
                d.append([x, y]);
                dis[x][y] = dis[curX][curY]+1;
print(dis)


