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

lst = [randrange(-100, 100) for _ in range(int(input('Vvedite razmernost` massiva: ')))]

def compare_nums(list_nums):
    count = 0
    for i in range(1, len(list_nums) - 1):
        if list_nums[i] > list_nums[i - 1] and list_nums[i] > list_nums[i + 1]:
            count += 1
    return count

print(lst, '-->', compare_nums(lst))