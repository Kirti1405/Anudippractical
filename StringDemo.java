public class StringDemo {
    public static void main(String[] args) {
        String name = "Kirti";
        String lname = "Dumbre";
        String fullname = name + lname;
        // Or: String fullname = name.concat(lname);

        System.out.println("Name is " + fullname);

        // Loop to print each character
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
