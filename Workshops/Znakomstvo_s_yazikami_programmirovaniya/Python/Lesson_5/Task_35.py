# Напишите функцию, которая принимает одно число и проверяет, является ли оно простым
# Напоминание: Простое число - это число, которое имеет 2 делителя: 1 и n(само число)
# Input: 5 Output: yes

n = int(input('Vvedite chislo: '))

def prost(n):
    for i in range(1, n - 1):
        if n%(n - i) == 0:
            print('no')
            break
    else:
        print('yes')   

prost(n)