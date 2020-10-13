# TCS NQT
n = int(input())
l = [int(i) for i in input().split()]
m = l[0]
for i in l:
    if(i>m):
        m = i

print(m)