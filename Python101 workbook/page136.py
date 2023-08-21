class Car:
    def __init__(self, license, brand, color, report = []):
        self.license = license
        self.brand = brand
        self.color = color
        self.report = report

    def __str__(self):
        return (f'{self.license} - {self.color} {self.brand}')

    def __lt__(self, rhs):
        return self.license < rhs.license

    def add_report(self, new_report):
        self.report.append(new_report)

    def total_payment(self):
        total = 0
        for i in self.report:
            total += i[2]
        return total


    def max_payment(self):
        if self.report != []:
            return list(reversed(sorted(self.report, key = lambda i: i[2])))
        else: return []

c = Car('AA1234', 'Honda', 'White')
c.add_report(('25 May 2017', 'change tires', 1500))
c.add_report(('26 May 2017', 'change car', 100000))
c.add_report(('27 May 2017', 'change tires', 150))

print(c)
print(c.total_payment())
print(c.max_payment())