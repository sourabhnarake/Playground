n = int(input())
l = [int(i) for i in input().split()][:n]
m = []

# print(l)

while l.count('a')!=len(l):
    k = []
    for p,i in enumerate(l):
        if i not in k:
            if(i!='a'):
                k.append(i)
                l[p] = 'a'
    k.sort()
    m.append(k)
print(len(m))