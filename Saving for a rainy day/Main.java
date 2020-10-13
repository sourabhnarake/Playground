p = int(input())
m = int(input())
r = round((float(input())/1200),11)
# print(r)
for i in range(m):
	if(i==0):
		q = round(p/(r+1),11)
	else:
		q = round((q+p)/(r+1),11)
j = round(q-int(q),2)*100
if(j>=50):
	print(int(q+1))
else:
	print(int(q))