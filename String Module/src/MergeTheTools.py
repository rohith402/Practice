def merge_the_tools(string, k):
    for i in xrange(0,len(string),k):
        l = []
        for j in range(i,i+k):
            if string[j] not in l:
                l.append(string[j])
        subStr = ''.join(l)
        print subStr


if __name__ == '__main__':
    merge_the_tools('AABCAAADA', 3)