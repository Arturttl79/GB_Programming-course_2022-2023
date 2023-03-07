# Задача 30: Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d. Каждое число вводится с новой строки.

# Ввод: 7 2 5
# Вывод: 7 9 11 13 15

first_element = int(input('Vvedite pervyi element: '))
diff = int(input('Vvedite raznost`: '))
qty = int(input('Vvedite kolichestvo elementov: '))
result = [first_element]

for i in range(1, qty):
    result.append(first_element + (i) * diff)

print(*result)
