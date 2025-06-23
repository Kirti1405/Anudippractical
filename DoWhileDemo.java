import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter number");
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int i=1;
        int num=10;
        int sum=0;
        
        do{
          sum+=i;
            i++;
        }
        while(i<=num);
        {
            System.out.println("sum of natural number from 1 to "+num+" is= "+sum);
        }
        }
        
        
    }
    

