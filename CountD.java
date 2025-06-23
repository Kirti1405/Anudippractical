public class CountD {
    public static void main(String[] args) {
        int num=69543;
        int count=0;
        while (num!=0) { 
            num=num/10;
            count++;
        }
        System.out.println("Digits "+count);
    }
    
}
