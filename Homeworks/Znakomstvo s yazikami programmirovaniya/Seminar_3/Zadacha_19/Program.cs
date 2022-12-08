/* Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
* 14212 -> нет
* 12821 -> да
* 23432 -> да
*/

Console.WriteLine("Введите пятизначное число: ");
int number = Convert.ToInt32(Console.ReadLine());
string str = number.ToString();
if(str.Length == 5)
{
    if(str[0] == str[4] && str[1] == str[3])
    {
        Console.WriteLine($"Число {str} является палиндромом");
    }
    else Console.WriteLine($"Число {str} не является палиндромом");
}
else Console.WriteLine($"Число {str} не пятизначное");