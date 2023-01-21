int[] array = new int[] { 2, 5, 10, 40, 21, 39, 0, 11 };

void FindSum(int[] array, int i, int sum)
{
    if(i>=array.Length)
    {
        System.Console.WriteLine(sum);
        return;
    }
    else
        sum = sum + array[i];
        FindSum(array, i + 1, sum);
}

FindSum(array, 0, 0);