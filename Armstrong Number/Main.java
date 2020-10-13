# TCS NQT
n = int(input())
l = len(str(n))
s = 0
for i in str(n):
    s+=int(i)**l
if(s==n):
    print('ARMSTRONG')
else:
    print('NOT AN ARMSTRONG')