/* Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.

* 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]

* 6, 1, 33 -> [6, 1, 33] */

int[] mass = new int[8];
Random random = new Random();
for (int i = 0; i < mass.Length; i++)
{
    mass[i] = random.Next(1, 100);
}
Console.Write($"[{mass[0]}, {mass[1]}, {mass[2]}, {mass[3]}, {mass[4]}, {mass[5]}, {mass[6]}, {mass[7]}]");
