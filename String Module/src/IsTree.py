n = int(raw_input())
el = map(int, raw_input().split())
flag = True
e = sum(el)/2
for i in el:
    if i == 0 or e > n-1:
        flag = False
        break
if flag:
    print('Yes')
else:
    print('No')