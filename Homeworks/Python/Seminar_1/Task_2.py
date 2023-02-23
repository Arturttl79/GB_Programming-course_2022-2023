# Задача 2: Найдите сумму цифр трехзначного числа.
# *Пример:*

# 123 -> 6 (1 + 2 + 3)
# 100 -> 1 (1 + 0 + 0)

number = int(input('Vvedite trehznachnoe chislo: '))
summ = 0

while number >= 10:
    summ += number % 10
    number //= 10
else:
    summ += number

print(f'Summa tryoh chisel = {summ}')