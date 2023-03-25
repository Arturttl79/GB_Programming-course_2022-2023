# 15. Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя, а другой для тещи. 
# Понятно, что для себя нужно выбрать арбуз потяжелей, а для тещи полегче. Но вот незадача: 
# арбузов слишком много и он не знает как же выбрать самый легкий и самый тяжелый арбуз? Помогите ему!
# Пользователь вводит одно число N – количество арбузов. Вторая строка содержит N чисел, 
# записанных на новой строчке каждое. Здесь каждое число – это масса соответствующего арбуза
# Input: 5 -> 5 1 6 5 9 Output: 1 9

quantity = int(input())

for i in range(quantity):
    weight = int(input())
    if i == 0:
        light = weight
        heavy = weight
    elif weight < light:
        light = weight
    if weight > heavy:
        heavy = weight

print (light, heavy)

# from random import randint

# n = int(input())
# _list = [randint(1, 15) for _ in range(n)]

# min = _list[0]
# max = _list[0]
# for el in _list:
#     if el > max:
#         max = el
#     if el < min:
#         min = el
# print(min, max)