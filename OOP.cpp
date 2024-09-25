#include <iostream>
using namespace std;

class Animal {
public:
    Animal() {
        std::cout << "create Animal" << std::endl;
    }

    // Destructor
    virtual ~Animal() {
        std::cout << "delete animal" << std::endl;
    }

    // virtual method for polymorphism
    virtual void sound() {
        std::cout << "animal makes a sound" << std::endl;
    }
};

class Dog : public Animal {
public:
    Dog() {
        std::cout << "dog" << std::endl;
    }

    // Destructor
    ~Dog() {
        std::cout << "delete dog" << std::endl;
    }

    // Override
    void sound() override {
        std::cout << "dog barks" << std::endl;
    }
};

class Cat : public Animal {
public:
    Cat() {
        std::cout << "cat" << std::endl;
    }

    // Destructor
    ~Cat() {
        std::cout << "delete cat" << std::endl;
    }

    // Override
    void sound() override {
        std::cout << "cat meows" << std::endl;
    }
};

int main() {
    Animal* a = new Animal(); // Animal object
    Dog* d = new Dog();       // Dog object
    Cat* c = new Cat();       // Cat object

    // Demonstrate polymorphism
    a->sound();   // Calls Animal's sound()
    d->sound();   // Calls Dog's sound()
    c->sound();   // Calls Cat's sound()

    // Delete objects to invoke destructors
    delete a;
    delete d;
    delete c;

    return 0;
}
