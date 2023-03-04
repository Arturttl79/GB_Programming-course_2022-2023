# Задача 26:  Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B
# с помощью рекурсии.
# *Пример:*

# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8

a = int(input('Vvedite chislo: '))
b = int(input('Vvedite stepen`: '))


def exponent(a, b):
    if b == 1:
        return a
    return a * exponent(a, b-1)


print(exponent(a, b))
