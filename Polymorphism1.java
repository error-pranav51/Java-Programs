import javax.lang.model.element.AnnotationMirror;

class Animal{
    void animalSound(){
        System.out.println("every animal makes sound");
    }
}
class Dog extends Animal{
    void animalSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void animalSound(){
        System.out.println("Cat meows");
    }
}
class Polymorphism1{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        a1.animalSound();
        d1.animalSound();
        c1.animalSound();
    }
}