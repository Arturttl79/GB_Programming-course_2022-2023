# Дано натуральное число. Требуется определить, является ли год с данным номером високосным. 
# Если год является високосным, то выведите YES, иначе выведите NO. 
# Напомним, что в соответствии с григорианским календарем, год является високосным, если его номер кратен 4, 
# но не кратен 100, а также если он кратен 400.
# Input: 2016 Output: YES

chislo = int(input('Vvedite god: '))
if chislo % 4 == 0 and chislo % 100 != 0 or chislo % 400 == 0:
    print("YES")
else:
    print("NO")