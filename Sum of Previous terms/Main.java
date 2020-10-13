# TCS NQT
n = int(input())
fs = 1
se = 2
if(n==1):
    print(fs)
    exit()
elif(n==2):
    print(se)
    exit()
elif(n>30):
    print('Invalid Input')
    exit()
for i in range(1, n-1):
    ls = fs + se
    fs = se
    se = ls
print(ls)