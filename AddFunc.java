import java.util.Scanner;
public class AddFunc {
     
    public static int add(int a,int b){
        int sum= a+b;
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        System.out.println(add(a,b));
        sc.close();

    }
}


