Console.WriteLine("Vvedite chislo: ");
int num0 = Convert.ToInt32(Console.ReadLine());
num0 = Math.Abs(num0);
for (int i = (-num0); i <= num0; i++)
{
    Console.Write(i + " ");
}