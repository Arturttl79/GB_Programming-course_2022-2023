class User:
    def __init__(self, name):
        self.name = name
        self.active = False
        self.symbol = None
        self.symbol_str = None
        self.symbol_int = None

    def set_active(self, active):
        self.active = active

    def set_symbol(self, symbol, symbol_str, symbol_int):
        self.symbol = symbol
        self.symbol_str = symbol_str
        self.symbol_int = symbol_int
