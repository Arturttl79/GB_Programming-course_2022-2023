"""
Задача:
Реализовать секундомер в любой парадигме. Секундомер должен поддерживать следующий функционал:
- Запуск
- Пауза
- Выход из паузы
- Остановка
"""

from model import Model
from view import View
from presenter import Presenter

# Создаём модель для работы с данными
model = Model()

# Создаём презентер и передаём в него модель
presenter = Presenter(model)

# Создаём вьюшку
view = View()

# Подключаем вьюшку к презентеру (чтобы её потом можно было менять при необходимости)
presenter.attach_view(view)

# Запускаем программу
presenter.run()
