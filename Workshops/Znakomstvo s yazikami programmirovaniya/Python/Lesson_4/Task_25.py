str = 'a a a b c a a d c d d'.split()
output = ''

dic = dict()
for i in str:
    if i in dic:
        dic[i] += 1
        output += f"{i}_{dic[i]} "
    else:
        dic[i] = 0
        output += f'{i} '



print(str, output)