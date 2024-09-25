
class Animal{
    //Constructure
    public Animal(){
        System.out.println("create Animal");
    }

    //Destructure
    protected void finalize()throws Throwable{
        System.out.println("delete animal");
    }
    
    public void sound(){
        System.out.println("animal make a sound");
    }
    
    
}

class Dog extends Animal{ //การสืบทอด
    //Constructure
    public Dog(){
        System.out.println("dog");
    }
    
    //Destructure
    @Override
    protected void finalize()throws Throwable{
        System.out.println("delete dog");
    }
    
    //Override
    @Override
    public void sound(){
        System.out.println("dog bark");
    }
}

class Cat extends Animal{
    //Constructure
    public Cat(){
        System.out.println("cat");
    }
    
    //Destructure
    @Override
    protected void finalize()throws Throwable{
        System.out.println("delete cat");
    }
    
    //Override
    @Override
    public void sound(){
        System.out.println("cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal an = new Dog(); //polymophic variable dog เป็นออบเจกต์หรืออินสแตนซ์ของคลาส Animal
        Dog d = new Dog();
        Cat c = new Cat();
        an = c;
        
        a.sound(); // สั่งให้ออบเจกต์ a รส่ง message เรียก sound() ของ Animal 
        an.sound(); // สั่งให้ออบเจกต์ an ส่ง message เรียก sound() ของ Cat 
        d.sound(); // สั่งให้ออบเจกต์ d ส่ง message เรียก sound() ของ Dog 
        c.sound(); // สั่งให้ออบเจกต์ c ส่ง message เรียก sound() ของ Cat 
    }
}
