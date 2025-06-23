public class InheritanceDemo {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
        c.display();
    }
    
}
class Parent{
    void show(){
        System.out.println("This is single inheritance!!!parent class called");
    }
}
class Child extends Parent {
    void display(){
        System.out.println("This is single inheritance!!!child class code");
    }
}
