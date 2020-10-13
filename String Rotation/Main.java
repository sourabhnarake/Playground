from itertools import permutations

a = input()
b = a
n = int(input())
l = [input().split() for i in range(n)]
for i in l:
    i[1] = int(i[1])
d = ''
for i in l:
    if(i[0]=='L'):
        b = b[i[1]:]+b[0:i[1]]
        d = d+b[0]
    elif(i[0]=='R'):
        b = b[len(a)-i[1]:]+b[0:len(a)-i[1]]
        d = d+b[0]

h = len(a)-n+1
z = [a[i:n+i] for i in range(h)]

p = []
for x in z: 
    for i in permutations(x,n):
        p.append(''.join(i))

if d in p:
    print('YES')
else:
    print('NO')