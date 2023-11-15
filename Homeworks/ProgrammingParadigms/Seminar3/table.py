class Table:
    """
    Доска для игры в крестики-нолики.

    За основу взят двумерный массив 3 на 3, который изначально заполнен значениями -1.
    При заполнении ноликом значение соотв. ячейки массива устанавливается 0, крестиком - устанавливается 1.
    """
    def __init__(self):
        self.cells = [
            [-1] * 3,
            [-1] * 3,
            [-1] * 3
        ]
        num_rows = len(self.cells)
        num_cols = len(self.cells[0])
        self.len = num_rows * num_cols

    def cell_is_available(self, indexes):
        """
        Проверка на незанятость ячейки в таблице
        """
        return self.cells[indexes["x"]][indexes["y"]] == -1

    def write_to_cell(self, indexes, value):
        """
        Записываем значение в таблицу
        """
        self.cells[indexes["x"]][indexes["y"]] = value
