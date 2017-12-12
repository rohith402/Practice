def minion_game(s):
    vowelsList = ['A', 'E', 'I', 'O', 'U']
    v = 0
    c = 0
    for i in range(len(s)):
        if s[i] in vowelsList:
            v = v+len(s)-i    
        else:
            c = c+len(s)-i
            
    if v>c:
        print 'Kevin', v
    elif c >v:
        print 'Stuart', c
    else:
        print 'Draw'  














s = raw_input()
minion_game(s)