import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);


        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] number=new int [size];
        System.out.println("Enter the numbers");
        for(int i= 0; i<size; i++){
            number[i]=sc.nextInt();

        }
        System.out.println("Enter the number x you want to search");
        int x= sc.nextInt();

        for(int i=0; i<size; i++){
            if(number[i]==x){
                System.out.println(x+"is found at"+ i);
                break;
            }
        

        }
        
    }
}