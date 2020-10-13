# TCS NQT
a = input()
l = ['break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var']
if a in l:
  	print('{} is a keyword'.format(a))
else:
  	print('{} is not a keyword'.format(a))