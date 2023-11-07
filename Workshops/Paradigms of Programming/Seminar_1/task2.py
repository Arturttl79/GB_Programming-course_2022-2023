# У вас есть список чисел, и ваша задача - отсортировать его по возрастанию.

#imperative approach
lst = [3, 4, 1, 6, 10]
lst.sort()
print(lst)

#declarative approach
lst1 = [3, 4, 1, 6, 10]
for i in range(len(lst1)):
    for j in range(i+1, len(lst1)):
        if lst1[i] > lst1[j]:
            lst1[i], lst1[j] = lst1[j], lst1[i]

print(lst1)