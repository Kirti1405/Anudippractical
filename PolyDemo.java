public class PolyDemo {
    
    String name;
    int age;
    void PrintInfo(String name,int age){
        System.out.println("Name: "+name+"Age: "+age);


    }

    void PrintInfo(int age){
        System.out.println("Age: "+age);
    }
    void PrintInfo(String name){
        System.out.println("Name: "+name);
    }

    //main  Method
    public static void main(String[] args) {
    PolyDemo p1= new PolyDemo();
        p1.PrintInfo("Kirti", 22);
        p1.PrintInfo(21);
        p1.PrintInfo("Akshada");

        
    }
    
}


