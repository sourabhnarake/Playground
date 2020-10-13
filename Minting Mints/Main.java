# TCS NQT
n,l = input().split(' ')
n = int(n)
l = int(l)
z = n-1
for i in range(1, l):
    n = n + z
    z = 2*z
print(n)