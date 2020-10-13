def rotate(l,ang):
    ang = ang//90
    if(ang%4==0):
        return l
    for _ in range(ang%4):
        p = []                    # row to column
        for j in range(0,len(l)):
            q = []
            for k in range(0,len(l)):
                q.append(l[k][j])
            q.reverse()
            p.append(q)
        l = p
    # print(l)
    return l

n = int(input())
l = [[int(j) for j in input().split()][:n] for i in range(n)]
# print(l)
rl = l

c = []
while True:
    flag = input()
    if(flag=='-1'):
        break
    c.append(flag.split(' '))
# print(c)

tang = 0
for i in c:
    if(i[0]=='A'):
        tang = tang + int(i[1])
        l = rotate(l,int(i[1]))
    elif(i[0]=='Q'):
        print(l[int(i[1])-1][int(i[2])-1])
    elif(i[0]=='U'):
        ul = rl
        ul[int(i[1])-1][int(i[2])-1] = int(i[3])
        l = rotate(ul,tang)