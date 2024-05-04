package ex20042024;

public class lab021 {
    public static void main(String[] args) {
    String name = "Shweta"; // assignment operator
    String name2 = new String("Shweta"); // new operator
        // how they store the values in jvm
        System.out.println(name);
        System.out.println("Your name is-->"+ name);
        System.out.printf("Your name is--> %s", name);
        System.out.println("\n-----All functions available in string---");

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.getBytes());
        System.out.println(name.charAt(2));
        // primitive data types dont have extra functions like non primitive



    }
}
