Console.WriteLine("Vvedite trehznachnoe chislo: ");
string input0 = Console.ReadLine() ?? "";
int.TryParse(input0, out int number0);
if ((number0 >= 100) && (number0<=999))
    Console.WriteLine(number0 % 10);
else
    Console.WriteLine("Chislo ne trehznachnoe");