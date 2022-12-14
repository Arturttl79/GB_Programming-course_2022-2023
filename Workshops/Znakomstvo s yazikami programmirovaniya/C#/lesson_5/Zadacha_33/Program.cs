/* Задача 33: Задайте массив. Напишите программу, которая определяет, присутствует ли заданное число в массиве.
4; массив [6, 7, 19, 345, 3] -> нет
-3; массив [6, 7, 19, 345, 3] -> да
*/

void NumsExists(int[] array, int target)
{
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] == target)
        {
            Console.WriteLine($"Число {target} присутствует в массиве.");
            return;
        }
    }
    Console.WriteLine("Не нашел");
}

NumsExists(array: new int[] {2, 4, 3, 1}, target: 1);
