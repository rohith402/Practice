import operator
n, m, k = map(int,raw_input().split());
val = [int(i) for i in raw_input().split()]
d = {};
for i in range(m):
    a, b = map(int,raw_input().split());
    if a in d:
        d[a].append(b);
    else:
        d[a] = list();
        d[a].append(b);
    if b in d:
        d[b].append(a);
    else:
        d[b] = list();
        d[b].append(a);
sorted_d = sorted(d.items(), key=operator.itemgetter(0));
print(sorted_d);
for item in sorted_d:
    id = {};
    for i in item[1]:
        id[i] = val[i-1];
    sorted_id = sorted(id.items(), key = lambda x:(x[1], -x[0]), reverse=True);
    #print(sorted_id);
    if len(sorted_id) < k:
        print('-1');
    else:
        print(sorted_id[k-1][0]);
        