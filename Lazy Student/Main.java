import math

def nCr(n,r):
    f = math.factorial
    return f(n) / f(r) / f(n-r)

t = int(input())
l = [[int(j) for j in input().split()][:3] for i in range(t)]
# print(l)

def mulinv(a):
    m = 1000000007
    for i in range(m):
        if((i*m+1)%a==0):
            return (i*m+1)/a

def computeGCD(x, y): 
  
   while(y): 
       x, y = y, x % y 
  
   return x

for i in l:
    n = 0
    d = int(nCr(i[0],i[1]))
    # print(z)
    a = i[0]-1
    b = i[1]-1
    # print(a,b)
    for i in range(i[2]):
        n = int(n+nCr(a,b))
        a-=1
    # print(n,d)
    g = computeGCD(n,d)
    # print(g)
    if(g!=1):
        n = n//g
        d = d//g
    # print(n,d)
    f = int((n*mulinv(d))%1000000007)
    print(f)