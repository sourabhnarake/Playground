# TCS NQT
n = int(input())
if(n==1 or n==2):
    print(1)
    exit()
elif(n%2==0):
  	tn = 3**(int(n/2)-1)
else:
  	tn = 2**(int(n/2))
print(tn)