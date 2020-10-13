# TCS NQT
def prime(a,b):
    s = 0
    for i in range(a+1, b):
        if(i==2):
            s+=2
        for j in range(2, int((i+2)/2)+1):
            if(i%j==0):
                break
            if(j==int((i+2)/2)):
                s+=i
    return s

a = int(input())
b = int(input())
if(a==0):
  	a = 1
s = prime(a,b)
print(s)