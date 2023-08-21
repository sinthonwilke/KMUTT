class Nisit:
    def __init__(self, name, year, faculty):
        self.name = name
        self.year = year
        self.faculty = faculty

    def __str__(self):
        return (f'{self.name} ({self.year}) {self.faculty}')

    def __lt__(self, rhs):
        if self.faculty == rhs.faculty:
            if self.year == rhs.year:
                if self.name != rhs.name: return self.name < rhs.name
            else: return self.year < rhs.year
        else: return self.faculty < rhs.faculty


n0 = Nisit('Krit', 4, 'Engineering')
n1 = Nisit('Boy', 3, 'Science')
n2 = Nisit('Prim', 2, 'Engineering')
n3 = Nisit('Joey', 2, 'Engineering')

n_sort = [n0, n1, n2, n3]
n_sort.sort()

[print(i) for i in n_sort]
