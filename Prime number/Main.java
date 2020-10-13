# TCS NQT
n = int(input())
if(n==1):
    print('0.00')
    exit()
elif(n==2):
    print('%.2f'%2**0.5)
    exit()  
s = 0
for i in range(2, int(n/2)+1):
    if(n%i==0):
        s = 1
if(s==0):
    print('%.2f'%n**0.5)
else:
    print('0.00')