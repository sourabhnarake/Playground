# TCS NQT
a,b = input().split()
a = int(a)
b = int(b)
z = []
l = 1
for i in range(2, min(a,b)+1):
    while(a%i==0 and b%i==0):
        a = a/i
        b = b/i
        z.append(i)
z.append(int(a))
z.append(int(b))
for i in z:
    l = l*i
print(l)