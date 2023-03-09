# Хранятся числа в спике. Нужно составить список пар четных чисел с их квадратом.

lst = [1, 2, 3, 5, 8, 15, 23, 38]

# lst = [(x, x ** 2) for x in lst if x % 2 == 0]

res = list(map(lambda x: (x, x ** 2), res := map(int, filter(lambda x: x % 2 == 0, lst))))

print(res)
