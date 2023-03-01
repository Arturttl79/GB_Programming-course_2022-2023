# Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в порядке 
# возрастания все те числа, которые встречаются в обоих наборах.
# Пользователь вводит 2 числа. n - кол-во элементов первого множества. m - кол-во элементов второго множества. 
# Затем пользователь вводит сами элементы множеств.

import random

n = int(input('Vvedite kol-vo elementov pervogo massiva: '))
m = int(input('Vvedite kol-vo elementov vtorogo massiva: '))
list_1 = [random.randrange(100) for i in range (n)]
list_2 = [random.randrange(100) for i in range (m)]
print(list_1, list_2)
u = list(set(list_1).intersection(set(list_2)))
u.sort()
print(u)