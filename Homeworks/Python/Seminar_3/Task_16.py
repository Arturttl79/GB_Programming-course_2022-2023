# * Задача 16: Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N]. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*
#     5
#     1 2 3 4 5
#     3 -> 1

number = int(input('Vvedite razmernost` massiva: '))
a=list()

for i in range(number):
    a.append(i + 1)

print(a)

x = int(input('Vvedite chislo X: '))

if x > 0 and x <= number:
    print(f'Chislo {x} vstrechaetsya 1 raz')
else:
    print(f'Chislo {x} vstrechaetsya 0 raz')
