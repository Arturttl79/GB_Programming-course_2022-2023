from abc import ABC, abstractmethod


class ViewInterface(ABC):

    @abstractmethod
    def show_menu(self) -> None:
        """
        Показываем меню программы
        """
        pass

    @abstractmethod
    def show_and_get_input(self) -> str:
        """
        Показываем строку для ввода команды
        :return: введённая команда
        """
        pass

    @abstractmethod
    def show_time(self, time) -> None:
        """
        Показываем время на секундомере
        :param time: запрошенное из модели время
        """
        pass

    @abstractmethod
    def show_action(self, action: str) -> None:
        """
        Показываем текущую команду
        :param action: текст команды
        """
        pass

    @abstractmethod
    def show_error(self, error: str) -> None:
        """
        Показываем сообщение об ошибке
        :param error: текст ошибки
        """
        pass