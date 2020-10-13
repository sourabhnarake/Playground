import math
vb = int(input())
db = int(input())
vc = int(input())
dc = int(input())
n = int(input())

a = dc*math.cos(n*vc*math.pi/180)-db*math.cos(n*vb*math.pi/180)
b = dc*math.sin(n*vc*math.pi/180)-db*math.sin(n*vb*math.pi/180)
z = math.sqrt((a*a)+(b*b))
print('{0:.2f}'.format(z))