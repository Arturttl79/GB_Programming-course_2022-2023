from model import Model
from view import View
from presenter import Presenter

# Создаём модельV
model = Model()

# Создаём презентер и передаём в него модель
presenter = Presenter(model)

# Создаём вьюер и передаём в него презентер
view = View(presenter)

# Присоединяем данный вьюер к презентеру (чтобы его потом можно было менять при необходимости)
presenter.attach_view(view)

# Запускаем программу
presenter.run()

