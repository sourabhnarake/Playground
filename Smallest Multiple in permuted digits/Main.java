from itertools import permutations
n,d = map(int,input().split())

n = str(n)
l = list(n)
l.sort()

for i in permutations(l,len(l)):
    g = int(''.join(i))
    if(g%d==0):
        print(g)
        exit()
print(-1)