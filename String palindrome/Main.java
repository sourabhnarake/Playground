# TCS NQT
c = input()
if(c==c[::-1]):
    print('{} is a palindrome'.format(c))
else:
    print('{} is not a palindrome'.format(c))