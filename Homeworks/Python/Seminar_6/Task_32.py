# Определить индексы элементов массива (списка), значения которых принадлежат заданному диапазону 
# (т.е. не меньше заданного минимума и не больше заданного максимума)

# Ввод: [-5, 9, 0, 3, -1, -2, 1, 4,-2,10,2,0,-9,8,10,-9, 0, -5, -5, 7]
# Вывод: [1, 9, 13, 14, 19]

from random import randrange

min_ = int(input('Vvedite minimal`noe znachenie chisla: '))
max_ = int(input('Vvedite maximal`noe znachenie chisla: '))
lst = [randrange(-10, 10) for _ in range(int(input('Vvedite kolichetvo elementov massiva: ')))]
result = list()

for i in range(len(lst)):
    if lst[i] > min_ and lst[i] < max_:
        result.append(i)

print(lst, '--> ', result)
