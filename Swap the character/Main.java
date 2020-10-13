# TCS NQT
a = input()
b = input()
c = input()
a = a.rstrip()
b = b.rstrip()
c = c.rstrip()
a1 = ''
b1 = ''
c1 = ''

l = ['A','a','E','e','I','i','O','o','U','u']
for i in a:
    if i in l:
        a1+='$'
    else:
        a1+=i

for i in b:
    if i not in l:
        b1+='#'
    else:
        b1+=i

c1 = a1+b1+c.upper()
print(c1)
    