

class Presenter:
    """
    Модуль, отвечающий за логику приложения
    """

    def __init__(self, model):
        # Вьюшка - модуль отображения
        self.view = None
        # Модель - модуль для работы с данными
        self.model = model

    # Подключаем вьюшку
    def attach_view(self, view):
        self.view = view

    # Начало программы
    def run(self) -> None:

        while True:
            self.view.show_menu()

            # Полученная из консоли команда
            choice = self.view.show_and_get_input()

            # Индикатор, показывать ли текущее время на секундомере
            show_time = True

            # Команда на запуск/паузу
            if choice == "1":
                self.view.show_action("Старт" if not self.model.start_time or self.model.is_paused else "Пауза")
                self.model.start_pause()

            # Команда на остановку отсчёта
            elif choice == "2":
                self.view.show_action("Стоп")
                self.model.stop()

            # Команда выхода из программы
            elif choice == "3":
                self.view.show_action("Выход")
                break

            # Непредусмотренная команда
            else:
                self.view.show_error("Введена некорректная команда")
                show_time = False

            # Показываем текущее время на секундомере
            if show_time:
                self.view.show_time(self.model.get_time())


