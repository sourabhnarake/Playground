# TCS NQT
n = int(input())
l = [int(i) for i in input().split()]
m = []
for i in l:
    if(i==0):
        m.append(i)
for i in l:
    if(i==1):
        m.append(i)
print(*m)