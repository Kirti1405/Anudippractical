class InDemo3 {
    
    public static void main(String[] args) {
        Shape s1=new Shape();
        Trangle t1=new Trangle();
        EqTrangle e1=new EqTrangle();
        s1.area();
        t1.area();
        e1.area();
    }
    
}
class Shape{
    void area(){
        System.out.println("Display  ");

    }
}
class Trangle extends Shape{
}
class EqTrangle extends Shape{
  
}
