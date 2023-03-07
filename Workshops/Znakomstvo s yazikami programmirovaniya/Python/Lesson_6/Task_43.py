# Дан список чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается, что любые два элемента, 
# равные друг другу образуют одну пару, которую необходимо посчитать. Вводится список чисел. 
# Все числа списка находятся на разных строках.
# Ввод: Вывод:
# 12323 2

from random import randrange

list_input = [randrange(0, 10) for _ in range(int(input('Vvedite razmernost` massiva: ')))]
# list_input = [1,2,3,2,3] #dlya primera s zadachi


# V sluchaye, kogda para, esli sovpala, to ee chisla po otdel`nosti povtorno ne rassmatrivayutsya:
def compare_pairs(list):
    count = 0
    for i in range(1, len(list) - 2):
        for j in range(i + 2, len(list)):
            if list[i - 1] == list[j - 1] and list[i] == list[j]:
                count += 1
                if j < len(list) - 2:
                    j += 1
                else:
                    break
    return count

def func(lst: list) -> int:
    el, *lst = lst  # el = lst[0], lst = [1:]
    if lst:
        return func(lst) + lst.count(el)

    return 0


if __name__ == '__main__':
    print(func([1, 2, 3, 2, 3]))

    
# V sluchaye, kogda para, esli sovpala, to ee chisla po otdel`nosti povtorno rassmatrivayutsya:
"""
def compare_pairs(list):
    count = 0
    for i in range(1, len(list) - 2):
        for j in range(i + 2, len(list)):
            if list[i - 1] == list[j - 1] and list[i] == list[j]:
                count += 1
    return count
"""

print(*list_input, '--> ', compare_pairs(list_input))