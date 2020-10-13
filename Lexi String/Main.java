t = int(input())
l = [[input(),input()] for i in range(t)]

for i in l:
    d = ''
    for j in i[0]:
        if j in i[1]:
            d=d+(j*i[1].count(j))
    print(d)