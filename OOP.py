class Animal:
    def _init_(self):
        print("create animal")
        
    def sound(self):
        print("animal makes a sound")
        
    def _del_(self):
        print("delete animal")

class Dog(Animal):
    def _init_(self):
        print("dog")
        
    def sound(self):
        print("dog barks")
        
    def _del_(self):
        print("delete dog")
        
class Cat(Animal):
    def _init_(self):
        print("cat")
        
    def sound(self):
        print("cat meows")
        
    def _del_(self):
        print("delete cat")

if __name__ == "__main__":
    a = Animal()
    d = Dog()
    c = Cat()
    
    a.sound()
    d.sound()
    c.sound()