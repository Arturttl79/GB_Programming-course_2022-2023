# Определение функции merge_sort, которая выполняет сортировку методом слияния.

# Дана в структурной парадигме, передедываем в процедурную

def merge_sort(arr):

    if len(arr) > 1: # Проверка, что длина массива больше 1 (иначе сортировка не нужна).
        mid = len(arr) // 2 # Вычисление середины массива.
        left_half = arr[:mid] # Создание левой половины массива.
        right_half = arr[mid:] # Создание правой половины массива.

        # Рекурсивный вызов merge_sort для левой и правой половин массива.
        merge_sort(left_half)
        merge_sort(right_half)

        # Объединение левой и правой половин в один отсортированный массив.
        merge_halfs(arr, left_half, right_half)

# Объединение левой и правой половин в один отсортированный массив
def merge_halfs(arr, left_half, right_half):

    i = j = k = 0

    while i < len(left_half) and j < len(right_half):
        if left_half[i] < right_half[j]:  # Сравнение элементов левой и правой половин.
            arr[k] = left_half[i]  # Если элемент из левой меньше, помещаем его в исходный массив.
            i += 1
        else:
            arr[k] = right_half[j]  # Если элемент из правой меньше, помещаем его в исходный массив.
            j += 1
        k += 1

    # Добавление оставшихся элементов из левой половины (если такие есть).
    k = add_rest_left_half_elems(i, k, arr, left_half)
    # Добавление оставшихся элементов из правой половины (если такие есть).
    add_rest_right_half_elems(j, k, arr, right_half)


# Добавление оставшихся элементов из левой половины (если такие есть).
def add_rest_left_half_elems(i, k, arr, left_half):
    while i < len(left_half):
        arr[k] = left_half[i]
        i += 1
        k += 1
    return k

# Добавление оставшихся элементов из правой половины (если такие есть).
def add_rest_right_half_elems(j, k, arr, right_half):
    while j < len(right_half):
        arr[k] = right_half[j]
        j += 1
        k += 1


my_array = [64, 34, 25, 12, 22, 11, 90] # Создание неотсортированного массива.
merge_sort(my_array) # Вызов функции сортировки слиянием.
print("Отсортированный массив (Merge Sort):", my_array) # Вывод отсортированного массива.