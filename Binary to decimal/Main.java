# TCS NQT
def dec(n):
    s = 0
    for p,i in enumerate(n):
        s+=int(i)*2**p
    return s

n = input()
d = dec(n[::-1])
print(d)