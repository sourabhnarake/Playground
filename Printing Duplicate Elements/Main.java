# TCS NQT
n = int(input())
l = [int(i) for i in input().split()]
z = []

for i in l:
    c = 0
    for j in l:
        if(i==j):
            c+=1
    if(c>1):
        if i not in z:
            z.append(i)

print(*z)