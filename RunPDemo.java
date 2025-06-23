public class RunPDemo {
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        Animal a=new Animal();
        a.sound();
        d.sound();
        c.sound();
    }
    
}
class Animal{
    void sound(){
        System.out.println("This is animal class");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
      
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        
        System.out.println("Cat is mewo...");
    }
}
