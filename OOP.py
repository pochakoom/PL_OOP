class Animal:
    #Constructor
    def __init__(self):
        print("create animal")
        
    def sound(self):
        print("animal makes a sound")
        
    #Destructor
    def __del__(self):
        print("delete animal")

class Dog(Animal): # Dog สืบทอดจาก Animal (Inheritance)
    #Constructor
    def __init__(self):
        print("dog")
        
    def sound(self):
        print("dog barks")
        
    #Destructor
    def __del__(self):
        print("delete dog")
        
class Cat(Animal): # Cat สืบทอดจาก Animal (Inheritance)
    #Constructor
    def __init__(self):
        print("cat")
        
    def sound(self):
        print("cat meows")
        
    #Destructor
    def __del__(self):
        print("delete cat")

if __name__ == "__main__":
    a = Animal()  # สร้างออบเจกต์จากคลาส Animal
    d = Dog()     # สร้างออบเจกต์จากคลาส Dog
    c = Cat()     # สร้างออบเจกต์จากคลาส Cat
    
    a.sound()     # ส่ง message เพื่อเรียกเมธอด sound() ของออบเจกต์ a 
    d.sound()     # ส่ง message เพื่อเรียกเมธอด sound() ของออบเจกต์ d ซึ่ง override จาก Animal (Polymorphism)
    c.sound()     # ส่ง message เพื่อเรียกเมธอด sound() ของออบเจกต์ c ซึ่ง override จาก Animal (Polymorphism)
