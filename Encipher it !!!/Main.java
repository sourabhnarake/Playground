# TCS NQT
c = input()
n = int(input())
l = [['A',1],['B',2],['C',3],['D',4],['E',5],['F',6],['G',7],['H',8],['I',9],['J',10],['K',11],['L',12],['M',13],['N',14],['O',15],['P',16],['Q',17],['R',18],['S',19],['T',20],['U',21],['V',22],['W',23],['X',24],['Y',25],['Z',26]]

z = c.upper()
for i in range(0, len(l)):
    if(l[i][0]==z):
        s = l[i][1]+n
if(s>26):
    s = s%26
    for i in range(0, len(l)):
        if(l[i][1]==s):
            k = l[i][0]
else:
    k = l[s-1][0]

if(z!=c):
    k = k.lower()
    print(k)
else:
    print(k)