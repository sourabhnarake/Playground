# TCS NQT
a = float(input())
b = float(input())
c = float(input())

m = (b*b)-(4*a*c)
p = -b/(2*a)

if(m<0):
    q = ((-m)**0.5)/(2*a)
    print('root1 = %.2f + '%p +'%.2fi'%q+'  root2 = %.2f - '%p +'%.2fi'%q)
else:
    q = (m**0.5)/(2*a)
    print('root1 = %.2f'%(p+q)+'  root2 = %.2f'%(p-q))