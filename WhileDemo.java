import java.util.Scanner;
public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number");
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
             
            if(i%2==0){
                System.out.println(i+" is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
            i++;
            
        }
    }
    
}
