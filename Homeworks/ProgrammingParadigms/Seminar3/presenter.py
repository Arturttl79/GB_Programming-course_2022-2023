
class Presenter:
    """
    Модуль, отвечающий за логику приложения
    """

    def __init__(self, model):
        self.view = None
        self.model = model
        self.steps_counter = 0

    def attach_view(self, view):
        self.view = view

    def run(self):
        self.view.show_start()
        self.view.show_next_iteration(self.model.get_active_user())

    def save_user(self, user_name) -> None:
        """
        Получает имя нового пользователя из вьюшки и отправляет его на сохранение в модель
        """
        self.model.save_user(user_name)

    def validate_user_name(self, name) -> bool:
        """
        Проверка имени игрока на корректность и незанятость
        """
        return True

    def validate_symbol_coord(self, coord) -> bool:
        """
        Проверка корректности введённых координат крестика или нолика
        """
        return True

    def save_iteration(self, user, coord) -> None:
        """
        Сохраняем сделанный ход - записываем в таблицу крестик или нолик
        """
        if self.model.cell_is_available(coord):
            self.steps_counter += 1
            self.model.save_iteration(user, coord)
            self.model.change_active_user()
            self.view.show_table(self.model.get_table())
            if self.model.check_if_win():
                self.view.show_win(user)
            elif self.steps_counter == self.model.get_table_len():
                self.view.show_game_over()
            else:
                self.view.show_next_iteration(self.model.get_active_user())
        else:
            self.view.show_error("Данная ячейка уже занята")
            self.view.show_table(self.model.get_table())
            self.view.show_next_iteration(self.model.get_active_user())
