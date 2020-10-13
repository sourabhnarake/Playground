def z(i,c):
    v = i.count(max(i))
    if(v>1):
        r = -1
        for _ in range(0,v):
            r = (i.index(max(i),r+1))
            c[r]+=1
    if(v==1):
        c[i.index(max(i))]+=1
    return c

n = int(input())
t = int(input())
l = [[int(j) for j in input().split()] for i in range(n)]
m = [[sum(i[0:j])*i[t] for j in range(2,t+1,2)] for i in l]
x = [[i[p] for i in m] for p in range(0,len(m[0]))]
c = [0 for i in range(n)]
for i in x:
    c = z(i,c)
print(c.index(max(c))+1)