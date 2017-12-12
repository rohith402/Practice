size = int(input())
mp = map(chr, range(97, 123))
str = ''.join(mp);
lt = []
for i in range(size):
    reqStr = str[size-i-1:size]
    reqStr = '-'.join(reqStr)
    reqStr = reqStr[::-1]+reqStr[1:len(reqStr)]
    lt.append(reqStr.center(((4*size)-3),'-'))
    print (reqStr.center(((4*size)-3),'-'))
    
for i in range(len(lt)-2,-1,-1):
    print lt[i]
