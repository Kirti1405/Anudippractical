public class SingleIn {
    public static void main(String[] args) {
        Trangle t = new Trangle();
        t.area(); 
        t.CalArea(10, 33); 
    }
}

class Shape {
    public void area() {
        System.out.println("Display Area");
    }
} 

class Trangle extends Shape {
    public void CalArea(int l, int b) {
        double result = 0.5 * l * b;
        System.out.println("Area of Triangle: " + result);
    }
}
