# TCS NQT
n = int(input())
a = 0
b = 1
l = [0,1]
if(n==1):
    print(a)
    exit()
elif(n==2):
    print(*l)
    exit()
for i in range(2, n):
    s = a+b
    a = b
    b = s
    l.append(s)
print(*l)