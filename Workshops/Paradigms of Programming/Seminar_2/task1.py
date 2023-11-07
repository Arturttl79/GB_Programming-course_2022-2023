# Структурное программирование
start = 10
end = 50
prime_numbers = []

# Проверяем каждое число в диапазоне на простоту
for num in range(start, end + 1):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
    else:
        prime_numbers.append(num)

print(f"Простые числа в диапазоне от {start} до {end}: {prime_numbers}")