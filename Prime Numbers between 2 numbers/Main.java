# TCS NQT
def primerange(n):
    l = [2,3]
    for i in range(2, n):
        for j in range(2, int(i**0.5)+1):
            if(i%j==0):
                break
            elif(i%j!=0 and j==int(i**0.5)):
                l.append(i)
    return l

n = int(input())
if(n==2):
    print(2)
    exit()
s = primerange(n+1)
print(*s)