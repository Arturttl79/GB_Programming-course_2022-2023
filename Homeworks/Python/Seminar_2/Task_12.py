# Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает Кате по математике. 
# Он задумывает два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать. 
# Для этого Петя делает две подсказки. Он называет сумму этих чисел S и их произведение P. 
# Помогите Кате отгадать задуманные Петей числа.

summ = int(input('Vvedite summu chisel: '))
multiply = int(input('Vvedite proizvedenie chisel: '))

discriminant = summ ** 2 - 4 * multiply 
x = (summ + discriminant ** (1 / 2)) / 2
y = summ - x

print(f'x = {x}, y = {y}')

for i in range(summ):
    for j in range(multiply):
        if i + j == summ and i * j == multiply:
            print(i, j) 
            break
    else:
        continue
    break
else:
    print('Решения нет.')

s = int(input('введите сумму двух чисел: '))
p = int(input('введите произведение двух чисел: '))

for x in range(1, 1000):
    if s - x == p // x and p % x == 0:
        print(x, p // x)
        break
else:
    print('решения нет')

