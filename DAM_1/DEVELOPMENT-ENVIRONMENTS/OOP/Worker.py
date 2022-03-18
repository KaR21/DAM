from Person import *
class Worker(Person):
    def __init__(self, i,n, s,M, d, pos):       
        super().__init__(i,n, s,M)
        self.dni = d
        self.position = pos


    def setdni(self):
        dni=input("Enter the dni")

    def setposition(self):
        position=input("Enter the position")

    def print(self):
        print(self.Id, self.name,self.surname,self.movile, self.dni,self.position)

w1=Worker(11,"Iñigo","Beltza","123456789", "11223344A", "boss")
w1.print()