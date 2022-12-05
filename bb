from math import sqrt

message = ('Добро пожаловать в самую лучшую программу для вычисления '
           'квадратного корня из заданного числа')


def calculate_square_root(Number: float) -> float:
    """Вычисляет квадратный корень."""
    return sqrt(Number)


def calc(your_number: float) -> float:
    """Условие выполнения."""
    if your_number <= 0:
        return your_number
    root = calculate_square_root(your_number)
    print(f'Мы вычислили квадратный корень из введённого вами числа.'
          f' Это будет: {root}')


print(message)
calc(25.5)
