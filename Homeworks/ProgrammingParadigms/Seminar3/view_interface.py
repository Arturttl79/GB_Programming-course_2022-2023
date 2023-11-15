from abc import ABC, abstractmethod


class ViewInterface(ABC):
    @abstractmethod
    def show_start(self) -> None:
        """
        Запрашиваем в консоли имена игроков и отправляем их в презентер на сохранение
        """
        pass

    @abstractmethod
    def show_next_iteration(self, user) -> None:
        """
        Экран следующего хода
        """
        pass

    @abstractmethod
    def show_table(self, table) -> None:
        """
        Выводим в консоль таблицу с крестиками и ноликами
        """
        pass

    def show_error(self, message) -> None:
        """
        Выводим сообщение об ошибке
        """
        pass

    def show_win(self, user) -> None:
        """
        Выводим сообщение о победе
        """
        pass
