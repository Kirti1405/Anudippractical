
public class PrimeDemo {

    public static boolean primeCheck(int n) {
        int temp=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp++;
            }
            if(temp==1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
       
        System.out.println(primeCheck(4));

        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // if (primeCheck(num)) {
        //     System.out.println(num + " is a prime number.");
        // } else {
        //     System.out.println(num + " is not a prime number.");
        // }

        // sc.close();
    }
}
