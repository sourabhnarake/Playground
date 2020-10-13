# TCS NQT
def facto(n):
    if(n==0 or n==1):
        return 1
    else:
        return n*facto(n-1)

n = input()
s = 0
for i in n:
    s = s + facto(int(i))

if(s==int(n)):
    print('Yes')
else:
    print('No')