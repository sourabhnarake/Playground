# TCS NQT
n = input()
a = 0
b = 0
f = 0
for i in n:
    if(f==0):
        a = a + int(i)
        f = 1
    else:
        b = b + int(i)
        f = 0
print(abs(a-b))