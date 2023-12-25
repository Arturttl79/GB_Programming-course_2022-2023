from view_interface import ViewInterface

class View(ViewInterface):
    """
    Модуль представления
    """

    def show_menu(self) -> None:
        """
        Показываем меню программы
        """
        print("---------------")
        print("1 - Старт/пауза")
        print("2 - Стоп")
        print("3 - Выход")
        print("---------------")


    def show_and_get_input(self) -> str:
        """
        Показываем строку для ввода команды
        :return: введённая команда
        """
        return input("Введите команду из перечисленных выше: ")


    def show_time(self, time: str) -> None:
        """
        Показываем время на секундомере
        :param time: запрошенное из модели время
        """
        time = int(time)
        min = time // 60
        sec = time % 60
        print("Время на секундомере:", f"{min:02}:{sec:02}")
        print()

    def show_action(self, action: str) -> None:
        """
        Показываем текущую команду
        :param action: текст команды
        """
        print()
        print("***", action.upper(), "***")

    def show_error(self, error: str) -> None:
        """
        Показываем сообщение об ошибке
        :param error: текст ошибки
        """
        print()
        print("ОШИБКА!!!", error)
        print()
