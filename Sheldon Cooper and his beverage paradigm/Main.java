from itertools import combinations
def d(m):
    comb = combinations(m, 3)    
    for i in list(comb):
        yield sum(i)  # generator is used

n = int(input())
l = [int(input()) for i in range(n)]
x = int(input())

for i in l:
    if(i<=0):
        print('Invalid input')
        exit()

if(n<3 or x<=0):
    print('Invalid input')
    exit()

m = [i for i in l if not(i>x)]

p = d(m)
if x in p:
    print('TRUE')
else:
    print('FALSE')