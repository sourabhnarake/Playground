# TCS NQT
n = int(input())
l = [int(i) for i in input().split()]
f = int(input())

if f in l:
    print(l.index(f)+1)
else:
    print('{} isn\'t present in the array.'.format(f))