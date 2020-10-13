# TCS NQT
def facto(n):
    if(n==0 or n==1):
        return 1
    else:
        return n*facto(n-1)

n = int(input())
z = facto(n)
print(z)