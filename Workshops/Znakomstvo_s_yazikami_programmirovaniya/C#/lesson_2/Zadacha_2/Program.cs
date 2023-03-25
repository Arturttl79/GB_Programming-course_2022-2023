void CompareNums(int x, int y)
{
    int a = x % y;
    if (a == 0) Console.WriteLine("Число 1 кратно 2");
    else Console.WriteLine(a);
}
CompareNums(16, 4);