# Даны два массива чисел. Требуется вывести те элементы первого массива (в том порядке, в каком они идут в первом
# массиве), которых нет во втором массиве. Пользователь вводит число N - количество элементов в первом массиве,
# затем N чисел - элементы массива. Затем число M - количество элементов во втором массиве.
# Затем элементы второго массива
# Ввод:
# 7
# 3 1 3 4 2 4 12
# 6
# 4 15 43 1 15 1
# Вывод:
# 3 3 2 12
# (каждое число вводится с новой строки)

n = int(input('Vvedite razmernost` pervogo massiva: '))
list_1 = list()

for i in range(n):
    list_1.append(int(input(f'Vvedite znachenie {i}-go elmenta dlya pervogo massiva: ')))

m = int(input('Vvedite razmernost` vtorogo massiva: '))
list_2 = list()

for j in range(m):
    list_2.append(int(input(f'Vvedite znachenie {j}-go elmenta dlya vtorogo massiva: ')))

result = list()

def subtract(a, b, c):
    for i in range(len(a)):
        for j in range(len(b)):
            if a[i] == b[j]:
                break
            elif j == len(b) - 1:
                c.append(a[i])
            continue
    if len(c) == 0:
        print('Massivy sovpadayut.')
    else:
        return c
    


print(subtract(list_1, list_2, result))
