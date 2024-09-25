
class Animal{
    public Animal(){
        System.out.println("create Animal");
    }
    
    protected void finalize()throws Throwable{
        System.out.println("delete animal");
    }
    
    public void sound(){
        System.out.println("animal make a sound");
    }
    
    
}

class Dog extends Animal{
    public Dog(){
        System.out.println("dog");
    }
    
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
    public Cat(){
        System.out.println("cat");
    }
    
    //Override
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
        Animal an = new Dog(); //polymophic variable
        Dog d = new Dog();
        Cat c = new Cat();
        an = c;
        
        a.sound();
        an.sound();
        d.sound();
        c.sound();
    }
}
