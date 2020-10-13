# TCS NQT
n = int(input())
l = [int(input()) for i in range(n)]
z = []

for i in l:
    c = 0
    for j in l:
        if(i==j):
            c+=1
    if(c==1):
        z.append(i)

print(*z)