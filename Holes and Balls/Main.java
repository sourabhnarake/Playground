h = int(input())
lhd = [int(i) for i in input().split()][:h] # this will take only h number of elements
b = int(input())
lbd = [int(i) for i in input().split()][:b]
z = lhd.copy()
lhd.reverse()

m = []
for i in lbd:
    for p,j in enumerate(lhd):
        if(i<=j):
            if m.count(z.index(j)+1)<(z.index(j)+1):
                m.append(len(lhd)-p)
                break
            elif(p+1==len(lhd)):
                m.append(0)
                break
        elif(p+1==len(lhd)):
            m.append(0)
            break

print(*m,sep=' ')