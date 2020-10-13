# TCS NQT
def octal(n):
    if(n<=7):
        return str(n)
    r = ''
    while(n>7):
        r = r + str(n%8)
        n = int(n/8)
    return r+str(n%8)

def dec(n):
    s = 0
    for p,i in enumerate(n):
        s+=int(i)*2**p
    return s

n = input()
d = dec(n[::-1])
o = octal(d)
print(o[::-1])