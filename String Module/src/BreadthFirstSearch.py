a = [[0,1,1,0], [0,0,1,0], [1,0,0,1], [0,0,0,1]];
q = []
q.append(input());
markList = [];
levelDict = dict();
lev = 0;
markList.append(q[0]);
levelDict[q[0]] = lev;
lev = lev+1;
while q:
    print(q[0]);
    peek = q.pop(0);
    for i in range(4):
        if (a[peek][i]==1 and i not in markList):
            q.append(i);
            markList.append(i);
            levelDict[i] = levelDict[peek]+1;
            
print(levelDict);
            
    #[d.append(i) for i in range(6) if (a[peek][i]==1 and i not in markList and i not in d)];