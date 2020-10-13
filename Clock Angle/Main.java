pr = int(input())
longitude = float(input())
period_of_rotation = float(pr)
t = float((period_of_rotation*longitude * 60)//360.0)
h = int(t//60)
m = int(t-(h*60))
H = h % 12 #24H format to 12H format 
M = m
angle = (11 * M / 2.0) - 30.0 * H
"""Angle between hands of clock if 60m=1hr for a 12 dail clock since the question contains
"irrespective of period of the earths rotation" this formula will be applicable for all cases"""
if(angle<0):
    print("{:.2f}".format(angle+360))
else:
	print("{:.2f}".format(angle))
