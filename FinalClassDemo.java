public class FinalClassDemo {
    public static void main(String[] args) {
        Car c=new Car();
        c.run();
    }
}
final class Vehical{
    final void runDemo(){
        System.out.println("Running");
    }
}
class Car extends Vehical{
    void run(){
        System.out.println("Car is running");
    }
}

//output showing error

    
