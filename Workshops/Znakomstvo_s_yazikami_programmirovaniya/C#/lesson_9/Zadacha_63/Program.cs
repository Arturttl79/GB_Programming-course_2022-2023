System.Console.WriteLine("Vvedite N: ");
var str = Console.ReadLine() ?? "";

int N = int.Parse(str);

string AddN(int n)
{
    if (n == 1) return n.ToString();
    else
    {
        return AddN(n-1) + ", " + n;
    }
}

System.Console.WriteLine(AddN(N));