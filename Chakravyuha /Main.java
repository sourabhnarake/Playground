n = int(input())
l = []
g = n*n

for i in range(n):
    v = []
    for j in range(n):
        v.append([0])
    l.append(v)

p = 1
a = 0
b = n
s = [(0,0)]
flag = 0
for i in range(n):
    for j in range(a,b):
        if(p%11==0):
            s.append((i,j))
        l[i][j] = p
        if(p==g):
            flag = 1
            break
        p+=1
    if(flag==1):
        break
    for k in range(i+1,b):
        if(p%11==0):
            s.append((k,j))
        l[k][j] = p
        if(p==g):
            flag = 1
            break
        p+=1
    if(flag==1):
        break
    for m in range(b-2,a-1,-1):
        if(p%11==0):
            s.append((k,m))
        l[k][m] = p
        if(p==g):
            flag = 1
            break
        p+=1
    if(flag==1):
        break
    for o in range(b-2,a,-1):
        if(p%11==0):
            s.append((o,m))
        l[o][m] = p
        if(p==g):
            flag = 1
            break
        p+=1
    if(flag==1):
        break
    a+=1
    b-=1

# print(l)
for x in l:
    for y in x:
            print(y,end='\t')
    print(end='\n')
print("Total Power points :", len(s))    
print(*s, sep="\n")