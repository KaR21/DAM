class Person:
    def __init__(self, i,n, s,M):

        self.Id= i
        self.name = n
        self.surname = s
        self.movile = M

    def setid(self):
        id=input("Enter the value of the id")

    def setname(self):
        name=input("Enter the value of the name")

    def setsurname(self):
        surname=input("Enter the value of the surname")

    def setmovil(self):
        movile = input("Enter the value of the movile number")

    def print(self):
        print(self.Id, self.name,self.surname,self.movile)

p1=Person(11,"Idoia","Mugartegi","657787677")
p1.print()
