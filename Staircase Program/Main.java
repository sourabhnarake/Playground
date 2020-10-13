a = 1
b = 2
k = int(input())
if(k==1):
    print(1)
elif(k==2):
    print(2)
else:
    for i in range(k-2):
        c = a+b
        a = b
        b = c
    print(c)
