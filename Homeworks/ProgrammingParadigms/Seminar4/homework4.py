
def correlation(lst1, lst2):

    if len(lst1) != len(lst2):
        raise ValueError("Массивы должны быть одинакового размера")

    mean_lst1 = sum(lst1) / len(lst1)
    mean_lst2 = sum(lst2) / len(lst2)

    chislitel = 0.0
    for i in range(len(lst1)):
        chislitel += (lst1[i] - mean_lst1) * (lst2[i] - mean_lst2)

    znamenatel_lst1 = (sum((i - mean_lst1) ** 2 for i in lst1) / len(lst1)) ** 0.5
    znamenatel_lst2 = (sum((i - mean_lst2) ** 2 for i in lst2) / len(lst2)) ** 0.5
    znamenatel = znamenatel_lst1 * znamenatel_lst2

    return chislitel / znamenatel

lst1 = [1, 2, 3, 4, 5]
lst2 = [5, 4, 3, 2, 1]

result = correlation(lst1, lst2)
print("Корреляция Пирсона: " + str(result))