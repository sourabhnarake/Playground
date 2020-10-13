# TCS NQT
n = int(input())
a = 0
b = 1
l = [0,1]
s = 0
if(n==1):
    print(l[0])
elif(n==2):
    print(l[1])
else:
    for i in range(2, n):
        s = a+b
        a = b
        b = s
    print(s)