public class CopyD {
    public static void main(String[] args) {
        Student s1 = new Student("Sakshi", 21);      
        Student s2 = new Student(s1);                 

        System.out.println("Original Student: " + s1.name + ", " + s1.age);
        System.out.println("Copied Student: " + s2.name + ", " + s2.age);
    }
}

class Student {
    String name;
    int age;

 
    // Parameterized constructor
    Student(String name, int age) {
    System.out.println("Parameterized constructor called");
    this.name = name;
    this.age = age;
    }

    Student(Student s) {
        System.out.println("Copy constructor called");
        this.name = s.name;
        this.age = s.age;
    }
}


