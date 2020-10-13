n = int(input())
a = 6
p = n-1
d = '     '
z = '00006'
x = 2
t = 1
for i in range(n):
    print(d*p,end='')
    if(i==0):
        print(z)
        p-=1
        continue
    for j in range(x):
        a = 22+a+(16*(t-1))
        print("%0.5d     "% (a),end='')
        t+=1
    print()
    x+=1
    p-=1
