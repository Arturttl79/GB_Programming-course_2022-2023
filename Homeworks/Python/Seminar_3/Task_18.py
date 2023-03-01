# * Задача 18: Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*
#     5
#     1 2 3 4 5
#     6 -> 5

number = int(input('Vvedite razmernost` massiva: '))
a=list()

for i in range(number):
    a.append(i + 1)

print(a)

x = int(input('Vvedite chislo X: '))

if x <= 1:
    print(f'Chislo "{x}" blizhe vsego k chislu "1"')
elif x > 1 and x <= number:
    print(f'Chislo "{x}" blizhe vsego k chislu "{x}"')
else:
    print(f'Chislo {x} blizhe vsego k chislu "{number}"')