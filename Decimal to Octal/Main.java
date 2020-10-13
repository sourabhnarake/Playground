# TCS NQT
def octal(n):
    if(n<=7):
        return str(n)
    r = ''
    while(n>7):
        r = r + str(n%8)
        n = int(n/8)
    return r+str(n%8)

n = int(input())
o = octal(n)
print(o[::-1])