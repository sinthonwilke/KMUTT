class Book:
    def __init__(self, title, price, keywords):
        self.title = title; self.price = price; self.keywords = set(keywords)

    def __lt__(self, rhs):
        if self.price != rhs.price: return self.price < rhs.price
        else: return self.title < rhs.title

    def __str__(self):
        return self.title + ' ($' + str(self.price) + ')'

    def update_price(self, new_price):
        self.price = new_price

    def get_common_keywords(self, other):
        return self.keywords & other.keywords


b1 = Book('Python', 99, ['code','computer'])
b2 = Book('Calculus', 199, ['maths'])
b3 = Book('Physics', 99, ['science','maths'])
b1.update_price(199)
print(Book.get_common_keywords(b2,b3))
if b3 < b2: print(b1)
books = [b1,b2,b3]
books.sort()
print(books[0],',',books[1],',',books[2])



class ShoppingCart:
    def __init__(self, id):
        self.id = id
        self.books = []

    def add_book(self, book, n):
        pass

    def delete_book(self, book):
        pass

    def get_total(self):
        pass
    def __lt__(self, rhs):
        pass
