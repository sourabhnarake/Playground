n = int(input())
if(n<=1):
    print('You cannot generate christmas tree')
    exit()
elif(n>20):
    print('Tree is no more')
    exit()
p = 1
z = n
a = n
for i in range(0,n-1):
    for j in range(0,a+1):
        print(' '*z,end='')
        print('*'*p)
        p+=2  
        z-=1
    if(i==0):
        p=3
        a-=2
        z=n-1
    else:
        p=3
        a=a-1
        z=n-1
print(' '*(z+1),end='')
print('*')
print(' '*(z+1),end='')
print('*')