

public class SubString {
    public static void main(String[] args) {

        // String fname = "KirtiDumbre";
        // String name=fname.substring(0,5);
        // System.out.println("Substring is: "+name);


        StringBuilder sb=new StringBuilder("Tony");
        System.out.println("charAt: "+sb.charAt(1));
        // sb.charAt(0);
        // System.out.println("CharAt: "+sb);

        sb.setCharAt(0, 'P');
         System.out.println("StCharAt:"+sb);

         sb.insert(0,'S');
         System.out.println("Insert: "+sb);

        
         sb.append('P');
         System.out.println("Append: "+sb);
         
         //System.out.println(sb.reverse());
          sb.reverse();
        System.out.println("Reverce: "+sb);

        sb.delete(0, 5);
        System.out.println("Delete: "+sb);

       
         
        


        

    }
  
}
