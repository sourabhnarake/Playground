from itertools import permutations

def dj(z,q):
    perms = permutations(z,q)
    s = []
    for i in perms:
        p = ''
        for j in i:
            p+=j
        if(p==p[::-1]):
            if p not in s:
                s.append(p)
    s.sort()
    return s

t = int(input())
l = [input() for i in range(t)]

for i in l:
    if(i!=i[::-1]):
        print('Not a palindrome')
    else:
        m = [j for j in i]
        c = dj(m,len(m))
        for i in c:
            print(i)