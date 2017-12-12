a = 2
m = {8,-10}
b = 3
n = {5,6,7}
res = sorted(list((m.difference(n)).union(n.difference(m))))
for i in res:
    print i