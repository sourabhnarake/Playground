# TCS NQT
def stringreverse(c,z):
    p = ''
    if(c[z]!='0'):
        p = stringreverse(c,z+1)
    p+=c[z-1]
    return p

c = input()
c+='0'
x = stringreverse(c,1)
print(x)