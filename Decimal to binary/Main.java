# TCS NQT
def bin(n):
    r = ''
    while(n!=1):
        r = r + str(n%2)
        n = int(n/2)
    return r+str(n%2)

n = int(input())
b = bin(n)
print(b[::-1])