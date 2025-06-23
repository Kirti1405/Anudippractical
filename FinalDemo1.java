public class FinalDemo1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.runDemo();
        c.run();
    }
}
class Vehical{
    final void runDemo(){
        System.out.println("Running");
    }
}
class Car extends Vehical{
    void run(){
        System.out.println("Car is running");
    }
}
