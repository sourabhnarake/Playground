# TCS NQT
n = int(input())
if(n==1 or n==2):
    print(0)
    exit()
elif(n%2==0):
  	tn = int(n/2)-1
else:
  	tn = n-1
print(tn)