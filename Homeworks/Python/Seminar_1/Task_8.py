# Задача 8: Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
# если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
# *Пример:*

# 3 2 4 -> yes
# 3 2 1 -> no

n = int(input('Vvedite kol-vo dolek po odnoy dline: '))
m = int(input('Vvedite kol-vo dolek po drugoy dline: '))
k = int(input('Vvedite kol-vo dolek, kotoroe hotite otlomit`: '))

if (k % n == 0 or k % m == 0) and k < m * n:
    print('yes')
else:
    print('no')