from view_interface import ViewInterface


class View(ViewInterface):
    """
    Модуль представления
    """

    def __init__(self, presenter):
        self.presenter = presenter

    def show_start(self) -> None:
        """
        Запрашиваем в консоли имена игроков и отправляем их в презентер на сохранение
        """
        users_count = 2
        i = 0
        while i < users_count:
            user_name = input("Имя игрока " + str(i + 1) + ": ")
            if self.presenter.validate_user_name(user_name) is False:
                print("Вы ввели некорректное имя.")
            else:
                i += 1
                self.presenter.save_user(user_name)

        print()
        print("-----------")
        print("ВНИМАНИЕ!")
        print("Координаты ноликов или крестиков нужно вводить в формате row:col, где row - номер строки, col - номер столбца.")
        print("Например, для второй ячейки в первом ряду нужно ввести 1:2.")
        print("-----------")
        print()

    def show_next_iteration(self, user) -> None:
        """
        Экран ввода координат следуюего символа (крестика или нолика)
        """
        while True:
            coord = input(user.name + ", введите координаты для " + user.symbol_str + "a: ")
            if self.presenter.validate_symbol_coord(coord):
                break
        self.presenter.save_iteration(user, coord)

    def show_table(self, table) -> None:
        """
        Выводим в консоль таблицу с крестиками и ноликами
        """
        print()
        print("-----------")
        for row in table:
            print("| ", end="")
            for k, v in enumerate(row):
                if k != 0:
                    print("  ", end="")
                if v == -1:
                    print(" ", end="")
                elif v == 0:
                    print("0", end="")
                else:
                    print("X", end="")
            print(" |")
        print("-----------")
        print()

    def show_error(self, message) -> None:
        """
        Выводим сообщение об ошибке
        """
        print()
        print(message)

    def show_game_over(self) -> None:
        """
        Выводим сообщение об окончании игры ничьёй
        """
        print("-----------")
        print("Игра окончена ничьёй!")
        print("-----------")

    def show_win(self, user) -> None:
        """
        Выводим сообщение о победе
        """
        print("-----------")
        print(user.name + ", вы выиграли!!!")
        print("-----------")