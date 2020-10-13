t = int(input())
# l = [[[int(k) for k in input().split()] for j in range(int(input()))] for i in range(t)]

for i in range(t):
    n = int(input())
    l = [[int(k) for k in input().split()][:3] for j in range(n)]
    # print(l)
    a = 0
    # z = []
    
    # b = 0
    for h in range(n+1):
        y = []
        for x in l:
            if(x[-1]==h):
                if(x[-1]==0):
                    a+=x[1]
                    continue
                y.append(x[1])
        if(len(y)!=0):
            a = a + max(y)
    print(a)