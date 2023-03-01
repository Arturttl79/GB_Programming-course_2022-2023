from random import randint

number = randint(0, 100)
max_number = 0
lst = list()
while number != 0:
    lst.append(number)
    if number > max_number:
        max_number = number
    number = randint(0, 100)
    print(number)

print(lst, max_number)