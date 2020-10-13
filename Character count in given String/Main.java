# TCS NQT
c = input()
if(len(c)>20):
    print('Invalid Input')
    exit()
c = c+'0'
m = ''
z = 0
for i in range(0, len(c)):
    if(c[i]==c[i+1]):
        z+=1
    elif(c[i+1]=='0'):
        z+=1
        m = m+c[i]+str(z)        
        break
    else:
        z+=1
        m = m+c[i]+str(z)
        z = 0
print(m)