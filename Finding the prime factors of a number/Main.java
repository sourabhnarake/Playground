# TCS NQT
def prime(n):
    l = [2,3]
    for i in range(2, n):
        for j in range(2, int(i**0.5)+1):
            if(i%j==0):
                break
            elif(i%j!=0 and j==int(i**0.5)):
                l.append(i)
    return l

def primefactor(n,l):
    z = []
    for i in l:
        while(n%i==0):
            n = n/i
            z.append(i)
    return z


n = int(input())
s = prime(n)
x = primefactor(n,s)
if(len(x)==0):
    print(n)
else:
    print(*x)