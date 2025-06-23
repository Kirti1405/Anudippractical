public class ConDemo {
    public static void main(String[] args) {
        Student s = new Student("Kirti", 21);
        s.display(); 
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        System.out.println("Constructor has been called");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    


    
}
