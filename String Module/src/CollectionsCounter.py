from collections import Counter
size = 10
sizeLt = [2, 3, 4, 5, 6, 8, 7, 6, 5, 18]
sizeMap = Counter(sizeLt)
cusSize =1
income = 0
for i in range(cusSize):
    s,c = 6,55
    if s in sizeMap:
        if sizeMap[s] != 0:
            income = income+c
            sizeMap[s] = sizeMap[s]-1
        
print(income)
print(sizeMap)
