def slice(a,b,l):
    d = 0
    for i in range(a,b+1):
        d = d+l[i]
    return d

n = int(input())
l = [int(i) for i in input().split()]
m = []
for i in range(0,n):
    for j in range(0,n):
        if(i>=j or i+1==j or j>=n-1):
            pass
        else:
            m.append([i,j])

# print(m)
k = 0
z = []
x = []
for i in m:
    a = i[0]
    b = i[1]
    if(slice(0,a-1,l)==slice(a+1,b-1,l)==slice(b+1,n-1,l)):
        f = [a,b]
        f.sort()
        z.append(('{'+str(f[0])+','+str(f[1])+'}'))
        f = [0,a-1]
        f.sort()
        x.append(('{'+str(f[0])+','+str(f[1])+'}'))
        f = [a+1,b-1]
        f.sort()
        x.append(('{'+str(f[0])+','+str(f[1])+'}'))                
        f = [b+1,n-1]
        f.sort()
        x.append(('{'+str(f[0])+','+str(f[1])+'}'))        
        k=1
if(k==1):
    print('Indices which form equi pair ',end='')
    print(*z,sep=',')
    print('Slices are ',end='')
    print(*x,sep=',')
else:
    print('Array does not contain any equi pair')