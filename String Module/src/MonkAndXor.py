from _collections import deque
n, k = map(int, raw_input().split())
val = map(int, raw_input().split())
ancestors = map(int, raw_input().split())
l = [[] for i in range(n)]
index = 1
cvl = [False]*n
for i in ancestors:
    l[index].append(i-1)
    l[i-1].append(index)
    index += 1
cnt = 0
for i in range(n):
    cvl[i] = True
    vl = [False]*n
    s = deque();
    xor = deque();
    s.append(i);
    xor.append(val[i])
    vl[i] = True
    while s:
        p = s.popleft()
        v = xor.popleft()
        for j in l[p]:
            if not vl[j] and not cvl[j]:
                vl[j] = True
                s.append(j)
                iv = v^val[j]
                xor.append(iv)
                if iv == k:
                    cnt += 1
    
print(cnt)
    