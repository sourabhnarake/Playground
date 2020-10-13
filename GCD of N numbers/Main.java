# TCS NQT
n = int(input())
l = [int(input()) for i in range(n)]
s = 0
for i in range(1, min(l)+1):
    for j in l:
        if(j%i==0):
            if(j==l[-1]):
                s = i
        else:
            break
print(s)