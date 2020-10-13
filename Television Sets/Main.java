def roomprice(mid,z,r1,r2,n):
    l = 0
    wt = n-mid
    for i,j in z.items():
        if(i<=wt):
            l = l+(i*r2*j)
        else:
            tv = i-wt
            l = l+((wt*r2+tv*r1)*j)
    return l

n = int(input())
r1,r2 = [int(i) for i in input().split()]
r = int(input())

z = []
for m in range(1,13):
    th = [4,6,9,11]
    ld = 32
    if(m==2):
        ld = 28+1
    elif m in th:
        ld = 30+1
    for d in range(1,ld):
        p = (6-m)*(6-m)+abs(d-15)
        if(p>=n):
            z.append(n)
        else:
            z.append(p)

my_dict = {i:z.count(i) for i in z}

lr = 0
hr = n

c = roomprice(hr,my_dict,r1,r2,n)
if(c<=r):
    print(n)
    exit()

while abs(lr-hr)!=1:
    mid = (lr+hr)//2
    c = roomprice(mid,my_dict,r1,r2,n)
    if(c<r):
        lr = mid
    elif(c>r):
        hr = mid
    elif(c==r):
        print(mid)
        exit()

for i in range(mid-1,mid+2):
    c = roomprice(i,my_dict,r1,r2,n)
    if(c>r):  
        print(i)
        exit()