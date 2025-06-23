public class Oops {
    
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="Blue";
        p1.type="Ballpen";
        p1.brand="Rorito";
        System.out.println(p1.color);
        System.out.println(p1.type);
        System.out.println(p1.brandn);
        p1.write();
                
    }

}
class Pen{
    String color;
    String type;
    String brand;
    public void write(){
        System.out.println("Writing Something");
    }




}
