Console.WriteLine("Vvedite chislo ot 1 do 7");
string input0 = Console.ReadLine() ?? "";

switch (input0)
{
    case "1" :
    Console.WriteLine("Eto ponedel`nik");
    break;

    case "2" :
    Console.WriteLine("Vtornik");
    break;

    case "3" :
    Console.WriteLine("Sreda");
    break;

    case "4" :
    Console.WriteLine("Chetverg");
    break;

    case "5" :
    Console.WriteLine("Pyatnica");
    break;

    case "6" :
    Console.WriteLine("Subbota");
    break;

    case "7" :
    Console.WriteLine("Voskresenye");
    break;

    default :
    Console.WriteLine("Nepravil`noe chislo");
    break;
}