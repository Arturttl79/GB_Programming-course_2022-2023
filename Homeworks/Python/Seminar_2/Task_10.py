# Задача 10: На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. 
# Определите минимальное число монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и 
# той же стороной. Выведите минимальное количество монет, которые нужно перевернуть

number = int(input('Vvedite kol-vo monetok: '))
gerb = 0
reshka = 0

for i in range(number):
    polozhenie = int(input('Vvedite polozhenie monetki sverhu (0 - gerb, 1 - reshka): '))
    if polozhenie == 0:
        gerb += 1
    elif polozhenie == 1:
        reshka += 1
    else:
        print('Vy vveli nepravil`noe chislo.')
        continue

if gerb > reshka:
    print(reshka)
else:
    print(gerb)