def print_rangoli(size):
    # your code goes here
    mp = map(chr, range(97, 123))
    for i in range(1, size+1):
        ptn = ''
        for j in range(1,i+1):
            if j==i :
                ptn = ptn + mp[size-j];
            else:
                ptn = ptn + mp[size-j]+'-';
        print (ptn.center(((4*size)-3),'-'))











if __name__ == '__main__':
    n = int(raw_input())
    print_rangoli(n)