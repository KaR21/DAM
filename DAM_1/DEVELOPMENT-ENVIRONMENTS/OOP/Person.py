class Person:
    def __init__(self, i,n, s, M):

        self.Id = i
        self.name = n
        self.surname = s
        self.movile = M

    def setid(self, id):
        self.id = id

    def setname(self, name):
        self.name = name

    def setsurname(self, surname):
        self.surname = surname

    def setmovil(self, movile):
        self.movile = movile

    def print(self):
        print(self.Id, self.name,self.surname,self.movile)

