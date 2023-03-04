# Хакер Василий получил доступ к классному журналу и хочет заменить все свои минимальные оценки на максимальные. 
# Напишите программу, которая заменяет оценки Василия, но наоборот: все максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4

# Output: 1 3 3 3 1
from random import randint
lst = [randint(1, 5) for i in range(int(input()))]

print(lst)

max_ = max(lst)
min_ = min(lst)

for i in range(len(lst)):
    if lst[i] == max_:
        lst[i] = min_

print(lst)