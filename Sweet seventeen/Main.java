# TCS NQT
a = input()
a = a[::-1]

d = 0
p = 1
di = {'A':10, 'B':11, 'C':12, 'D':13, 'E':14, 'F':15, 'G':16, 'H':17}
for i in a:
    for j in di:
        if(j==i):
            i = di[j]
            break
    d = d + int(i)*p
    p = p*17
print(d)