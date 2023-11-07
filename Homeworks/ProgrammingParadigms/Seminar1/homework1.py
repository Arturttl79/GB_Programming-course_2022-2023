# Дан список целых чисел numbers

numbers = [4, 2, 7, 1, 9, 3]

# Задача 1
# Необходимо написать в императивном стиле процедуру
# для сортировки числа в списке в порядке убывания.
# Можно использовать любой алгоритм сортировки.

def sort_list_imperative(numbers):

    numbers_copy = numbers.copy() # чтобы не менять значение списка за пределами функции
    sorted_numbers = []

    while numbers_copy:
        min_num = max(numbers_copy)
        sorted_numbers.append(min_num)
        numbers_copy.remove(min_num)

    return sorted_numbers

sorted_numbers = sort_list_imperative(numbers)
print("Отсортированный список:", sorted_numbers)


# Задача 2
# Написать точно такую же процедуру, но в декларативном стиле

def sort_list_declarative(numbers):

    return sorted(numbers, reverse=True)

    # или

    # numbers_copy = numbers.copy()  # чтобы не менять значение списка за пределами функции
    # numbers_copy.sort(reverse=True)
    # return numbers_copy

sorted_numbers = sort_list_declarative(numbers)
print("Отсортированный список:", sorted_numbers)
