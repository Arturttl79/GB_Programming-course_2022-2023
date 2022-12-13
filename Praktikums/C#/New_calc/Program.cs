 // Для удобства будем использовать клавиши 1,2,3,4.
            Console.WriteLine("1 = Плюс, 2 = Минус, 3 = Умножение, 4 = Деление");
            
            // Ввод клавиши.
            ConsoleKey consoleKey = Console.ReadKey().Key;
            Console.WriteLine();
            
            // a = Первое число, b = Второе число, c = Будущий ответ.
            double a, b, c;             

            // Ввод чисел и конвертация.
            Console.Write("Введите первое число = ");       
            a = double.Parse(Console.ReadLine());           

            Console.Write("Введите второе число = ");
            b = double.Parse(Console.ReadLine());
            

            // Начало выислений.
            switch (consoleKey)
            {
                case ConsoleKey.D1: // Клавиша 1
                    {
                        c = a + b;  // Операция 
                        Console.WriteLine("Ответ = " + c); // Ввывод ответа
                        break;
                    }                    

                case ConsoleKey.D2: // Клавиша 2
                    {
                        c = a - b;  // Операция 
                        Console.WriteLine("Ответ = " + c); // Ввывод ответа 
                        break;
                    }
                case ConsoleKey.D3: // Клавиша 3
                    {
                        c = a * b;  // Операция 
                        Console.WriteLine("Ответ = " + c); // Ввывод ответа
                        break;
                    }

                case ConsoleKey.D4: // Клавиша 4
                    if (b == 0) //  Если деление будет на 0 
                    {
                        Console.WriteLine("На 0 делить нельзя!");
                    }
                    else
                    {                   
                        c = a / b;  // Операция 
                        Console.WriteLine("Ответ = " + c); // Вывод ответа                   
                    }
                    break;

                default: // Если не понятно оператор или бабра кадабра  
                    {
                        Console.WriteLine("Что-то не так.");
                        break;
                    }                    
            }
            Console.ReadLine();