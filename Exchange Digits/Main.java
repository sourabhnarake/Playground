from itertools import permutations

a,b = input().split()
if(len(a)<len(b)):
    print(-1)
else:
    b = int(b)
    l = list()

    k=1
    d=1

    for i in a:
        l.append(int(i))

    l.sort()
        
    perm = permutations(l)
    for i in list(perm):
        for j in i:
            if(k==1):
                m=j*1
                k=2
                continue
            m=m*10+j
        k=1
        if(m>b):
            print(m)
            d=2
            break
    if(d==1):
        print(-1)