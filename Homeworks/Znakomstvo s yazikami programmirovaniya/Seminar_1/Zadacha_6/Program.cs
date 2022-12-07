Console.WriteLine("Vvedite chislo: ");
string input = Console.ReadLine() ?? "";
int number = Convert.ToInt32(input);

if (number % 2 == 0)
    Console.WriteLine ("Chislo chetnoe");
else
    Console.WriteLine ("Chislo nechetnoe");