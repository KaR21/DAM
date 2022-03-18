from Person import *
class Worker(Person):
    def __init__(self, i,n, s,M, d, pos):
        super().__init__(i,n, s,M)
        self.dni = d
        self.position = pos

    def setdni(self, dni):
        self.dni = dni

    def setposition(self, pos):
        self.position = pos

    def getdni(self):
        return self.dni

    def getposition(self):
        return self.position

    def print(self):
        print(self.Id, self.name,self.surname,self.movile, self.dni,self.position)
