public class StMethod {
    public static void main(String[] args) {
        
        System.out.println(MathUtil.square(2));//when mwthod is static no need to create object
    }
}
class MathUtil{
    //int x=10;
    static int square(int x){
        return  x*x;
    }
}
