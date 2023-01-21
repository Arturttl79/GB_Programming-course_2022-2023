int[] array = new int[] { 2, 5, 10, 40, 21, 39, 0, 12 };

void PrintArray(int[] array, int i)
{
    if (i >= array.Length)
        return;
    else
    {
        System.Console.Write(array[i] + ", ");
        PrintArray(array, i + 1);
    }
}

PrintArray(array, 0);