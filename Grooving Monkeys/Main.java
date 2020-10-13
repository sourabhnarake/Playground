t = int(input())
l = []
for i in range(t):
    n = int(input())
    l.append([int(i) for i in input().split()])
for i in l:
    f = [i for i in range(1,len(i)+1)]
    v = f.copy()
    m = [0 for i in range(1,len(i)+1)]
    k = 0
    while True:
        for p,j in enumerate(i):
            m[j-1]=f[p]
        k+=1
        f = m.copy()
        if(v==m):
            print(k)
            break