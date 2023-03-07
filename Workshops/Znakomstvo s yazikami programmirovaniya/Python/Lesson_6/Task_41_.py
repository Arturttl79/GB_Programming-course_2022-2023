# Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит количество элементов,
# у которых два соседних и, при этом, оба соседних элемента меньше данного. Сначала вводится число N —
# количество элементов в массиве Далее записаны N чисел — элементы массива. Массив состоит из целых чисел.
# Ввод:
# 5
# 1 2 3 4 5
# Вывод:
# 0
# Ввод:
# 5
# 1 5 1 5 1
# Вывод:
# 2

from random import randrange

lst = [1, 5, 1, 5, 1]

count_nums = 0

for i in range(len(lst[2:]) + 2):
    if lst[i] < lst[i - 1] > lst[i - 2]:
        count_nums += 1

print(lst, '-->', count_nums)
