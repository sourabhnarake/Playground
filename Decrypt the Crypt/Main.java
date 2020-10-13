a = input().split('|')
b = input()
b = b.strip()

if(len(b)!=10):
    print(-1)
    exit()
    
a.pop(-2)

z = [int(i) for i in a.pop(-1)]
x = [z.pop(-1)]

# print(a)
# print(b)
# print(z)
# print(x)

l = [[int(j) for j in i] for i in a if(len(i)!=1)]

for i in l:
    i[-1]=str(i[-1])

# print(l)

k = []
r = 0
while True:
    flag = 0
    for i in l:
        if r in i:
            k.append(int(i[-1]))
            flag = 1
            break
    if(flag==0):
        break
    r+=1

# print(k)

for i in z:
    k[i]+=10

k.pop(-1)

for p,i in enumerate(k):
    x.append(i-x[p])

d = ''
for i in x:
    d+=b[i]

print(d)