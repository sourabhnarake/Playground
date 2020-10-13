# TCS NQT
t = int(input())
l = []
for i in range(t):
    p = []
    q = []
    m,n = input().split()
    m = int(m)
    n = int(n)
    for j in range(m):
        p.append([int(k) for k in input().split()])
    for j in range(m):
        q.append([int(k) for k in input().split()])
    for x in range(m):
        z = []
        for y in range(n):
            z.append(p[x][y]+q[x][y])
        l.append(z)
for i in l:
    for j in i:
        print(j,end=' ')