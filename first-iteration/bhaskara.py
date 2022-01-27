from math import sqrt

import greeter

user = input('Please, enter the user:')
greeter = greeter.Greeting(user)
greeter.greet()
print('Protocol Bhaskara')
a = float(input('Please, inform the value of a:'))
b = float(input('Please, inform the value of b:'))
c = float(input('Please, inform the value of c:'))
delta = b ** 2 - 4 * a * c
x1 = ((-b) + sqrt(delta))/(2 * a)
x2 = ((-b) - sqrt(delta))/(2 * a)
xvertex = (-b)/(2 * a)
yvertex = (-delta)/(4 * a)
print('Answer Sheet: \n'
      'Delta = {} \n'
      'First root = {} \n'
      'Second root = {} \n'
      'Vertex X = {} \n'
      'Vertex Y = {}'.format(delta, x1, x2, xvertex, yvertex))
