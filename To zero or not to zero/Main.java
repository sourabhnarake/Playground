# TCS NQT
s,e = input().split(' ')
k = len(e)

for i in range(int(s), int(e)+1):
    i = str(i)
    z = len(i)
    if(z!=k):
        for j in range(0, k-z):
            i = '0' + i
        print('{} '.format(i),end='')
    else:
        print('{} '.format(i),end='')