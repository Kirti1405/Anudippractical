public class StaticDemo {
    public static void main(String[] args) {
        
        Student s1 =new Student("Kirti",21);
        Student s2 =new Student("Sakshi", 22);

        System.out.println(s1.name + " "+s1.age +" "+ s1.college);
        System.out.println(s2.name +" "+ s2.age + " "+s2.college);
    }
    
}
class Student{
    static String college="DYP";
    String name;
    int age;
   

    Student(String name,int age) {
        this.name=name;
        this.age=age;
    }
   
}
