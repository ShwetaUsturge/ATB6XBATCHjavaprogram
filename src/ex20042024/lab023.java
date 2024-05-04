package ex20042024;

public class lab023 {
    public static void main(String[] args) {
        String name ="The testing academy";// SCP
        String name1 = "The testing academy"; // SCP
        String name2 = new String("The testing academy"); // heap area
        System.out.println(name==name);
        System.out.println(name.equals(name1));
        System.out.println(name == name2); // this is for references
        System.out.println(name.equals(name2)); // this is for content
        System.out.println("---------");
        String s1 = new String("Shweta"); // references
        String s2 = new String("Shweta");// references in heap area
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("000000");
        String s4 = "Shweta";
        char c = s4.charAt(5);
        System.out.println(c);
        boolean result = s4.contains("d"); // false
        System.out.println(result);
        s4 = s4.concat("Usturge");
        System.out.println(s4);



    }
}
