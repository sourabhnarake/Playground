# TCS NQT
n = input()
s = ''
l = ['a','A','e','E','i','I','o','O','u','U']
for i in n:
    if i in l:
        continue
    else:
        s+=i
print(s)