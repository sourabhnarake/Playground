# TCS NQT
c = input()
l = ''
for i in c:
  	if i not in l:
  		l = l+i
l = l[::-1]        
print(l)
    