from collections import deque
n = 1
for i in range(n):
    s = 3
    d = deque([1,3,2])
    exp = deque()
    flag = True
    while (len(d) != 0):
        if(len(exp) != 0):
            if (d[0] >= d[-1]) and (d[0] <= exp[0]):
                exp.append(d[0])
                d.popleft()
            elif (d[-1] > d[0]) and (d[-1] <= exp[0]):
                exp.append(d[-1])
                d.pop()
            else:
                flag = False
                break;
        else:
            if (d[0] > d[-1]):
                exp.append(d[0])
                d.popleft()
            else:
                exp.append(d[-1])
                d.pop()
                
    if flag:
        print('Yes')
    else:
        print('No')
    