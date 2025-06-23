
public class StClass {
    public static void main(String[] args) {
        Outer.inner i= new Outer.inner();
        i.messege();
    }
}
    class Outer{
        static int data=20;
       static  class inner{
            void messege(){
                System.out.println(data);
            }
        }
    }
    
