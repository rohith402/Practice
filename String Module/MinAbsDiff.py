n,a = input(),sorted(map(int, raw_input().split()))
#print(min(abs(x-y) for x,y in zip(a,a[1:])))
print(min([abs(x-y) for x, y in zip(a,a[1:])]))