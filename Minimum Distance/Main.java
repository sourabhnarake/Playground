from math import hypot
a = int(input())
b = int(input())
va = int(input())
vb = int(input())
if(a<=0 or b<=0 or va<=0 or vb<=0):
	print("Invalid Input")
else:
    l = []
    while True:
        z = hypot(a,b)
        l.append(z)
        a-=va
        b-=vb
        if(len(l)>2):
            if(l[-1]>l[-2]):
                break
            l.pop(0)
    k = round(min(l),11)
    if(k==0.0):
        print(k)
        exit()
    p,j = str(k).split('.')
    if(len(j)!=11):
        print(p+'.'+j+(str(0)*(11-len(j))))
    else:
        print(k)