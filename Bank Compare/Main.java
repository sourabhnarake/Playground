p = int(input())
t = int(input())
s1 = int(input())
l1 = []
for i in range(s1):
    m = []
    a,b = input().split()
    m.append(int(a))
    m.append(float(b))
    l1.append(m)

s2 = int(input())
l2 = []
for i in range(s2):
    m = []
    a,b = input().split()
    m.append(int(a))
    m.append(float(b))
    l2.append(m)

d1 = 0
for i in range(s1):
    d1 = d1 + ((p*l1[i][0]*l1[i][1])/100)
# print(d1)

d2 = 0
for i in range(s2):
    d2 = d2 + ((p*l2[i][0]*l2[i][1])/100)
# print(d2)
if(d1<d2):
    print("Bank A")
else:
    print("Bank B")