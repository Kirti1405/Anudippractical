
public class FactorialDemo {
    public static int printFact(int n){

        //base case 1
        if(n<0){
            return -1;
        }
        //base case 2
        if(n==0){
            return 1;
        }
        int Fact = 1;
        
        for(int i = n; i>=1; i--){
            Fact = Fact * i;
        }

        return  Fact;
    }


    public static void main(String[] args) {
        System.out.println(printFact(4));
        
    }
}
