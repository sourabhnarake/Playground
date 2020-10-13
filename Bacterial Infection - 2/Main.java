def f(p,m,n,fire_layout):
    l = []
    for i in p:
        a=i[0]
        b=i[1]
        if(0<=a-1<m and 0<=b<n and fire_layout[a-1][b]=='o'):
            fire_layout[a-1][b]="t1"
            l.append([a-1,b])
        if(0<=a<m and 0<=b-1<n and fire_layout[a][abs(b-1)]=='o'):
            fire_layout[a][abs(b-1)]="t1"
            l.append([a,b-1])
        if(0<=a<m and 0<=b+1<n and fire_layout[a][b+1]=='o'):
            fire_layout[a][b+1]="t1"
            l.append([a,b+1])
        if(0<=a+1<m and 0<=b<n and fire_layout[a+1][b]=='o'):
            fire_layout[a+1][b]="t1"
            l.append([a+1,b])
    return l

r,c = [int(i) for i in input().split()]

fire_layout = []
for i in range(0, r):
    fire_layout.append(input().split())

x,y = [int(i) for i in input().split()]

if(fire_layout[x][y]=='o'):
    t=1
    l = [[x,y]]
    fire_layout[x][y]="t1"
    while len(l)>0:
        m=f(l,r,c,fire_layout)
        l=m
        if(len(l)>0):
            t+=1
    print(t)
else:
    print('0')