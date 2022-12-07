Console.WriteLine("Vvedite chislo: ");
string input0 = Console.ReadLine() ?? "";
int num0 = Convert.ToInt32(input0);
num0 = Math.Abs(num0);
for (int i = (-num0); i <= num0; i++)
{
    Console.Write(i + " ");
}