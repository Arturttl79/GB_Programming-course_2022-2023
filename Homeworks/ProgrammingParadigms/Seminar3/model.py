from user import User
from table import Table

class Model:
    """
    Модуль работы с данными
    """

    def __init__(self):
        self.users = []
        self.table = Table()

    def save_user(self, name):
        """
        Создаём игрока.
        Первому игроку даём крестик, второму - нолик.
        Первого игрока делаем активным, т.е. его ход будет первым
        """
        user = User(name)
        self.users.append(user)
        if len(self.users) == 1:
            user.set_active(True)
            user.set_symbol("X", "крестик", 1)
        else:
            user.set_symbol("0", "нолик", 0)

    def print_users(self):
        for user in self.users:
            print("name: " + user.name
                  + ", active: " + ("True" if user.active is True else "False")
                  + ", symbol: " + user.symbol
                  + ", symbol_str: " + user.symbol_str
                  + ", symbol_int: " + str(user.symbol_int))

    def get_active_user(self) -> User:
        """
        Находим игрока с атрибутом active = True
        """
        for user in self.users:
            if user.active is True:
                return user

    def cell_is_available(self, coord) -> bool:
        """
        Проверка на незанятость ячейки в таблице
        """
        indexes = self.get_list_indexes(coord)
        return self.table.cell_is_available(indexes)

    def save_iteration(self, user, coord) -> None:
        """
        Записываем ход в таблицу крестиков-ноликов.
        """
        indexes = self.get_list_indexes(coord)
        self.table.write_to_cell(indexes, user.symbol_int)

    def change_active_user(self) -> None:
        """
        Делаем следующего игрока активным (алгоритм делаем под случай, если у нас будет игроков больше, чем 2).
        """
        # Находим индекс текущего игрока
        active_index = 0
        for user in self.users:
            if user.active:
                user.active = False
                break
            active_index += 1
        # Находим индекс следующего игрока
        if active_index < len(self.users) - 1:
            next_index = active_index + 1
        else:
            next_index = 0
        i = 0
        for user in self.users:
            if i == next_index:
                user.set_active(True)
                break
            i += 1

    def get_list_indexes(self, coord) -> dict:
        """
        Переводим координаты из строки формата "x:y" в словарь {"x": x - 1, "y": y - 1}
        """
        x, y = coord.split(":")
        return {"x": int(x) - 1, "y": int(y) - 1}

    def get_table(self) -> list:
        """
        Передаём список ячеек таблицы с крестиками и ноликами
        """
        return self.table.cells

    def get_table_len(self) -> int:
        """
        Возвращает число ячеек таблицы (с расчётом на расширение, что их может быть больше 9)
        """
        return self.table.len

    def check_if_win(self) -> bool:
        """
        Проверяем, есть ли три нолика или три крестика подряд
        """
        table_size = len(self.table.cells)
        # Проверяем ряды и столбцы
        for i in range(0, table_size):
            if self.table.cells[i][0] != -1 and (self.table.cells[i][0] == self.table.cells[i][1] == self.table.cells[i][2]):
                return True
            if self.table.cells[0][i] != -1 and (self.table.cells[0][i] == self.table.cells[1][i] == self.table.cells[2][i]):
                return True
        # Проверяем диагонали
        if self.table.cells[1][1] != -1:
            if self.table.cells[0][0] == self.table.cells[1][1] == self.table.cells[2][2]:
                return True
            if self.table.cells[0][2] == self.table.cells[1][1] == self.table.cells[2][0]:
                return True
        return False

