void Range(int m, int n)
{
    if (n >= m)
    {
        System.Console.Write($"{m} ");
        Range(m + 1, n);
    }
}

Range(2, 5);