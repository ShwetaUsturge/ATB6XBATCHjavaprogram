package ex18042024;

public class lab0017 {
    public static void main(String[] args) {
        // casting mold
        byte b= 10;
        // int a = (int) b; // implicit casting--> JVM (you don't have to specify)
        int a =  b; // explicit casting ---> JVM
        System.out.println(a);
        int a1= 300;
        byte b1 = (byte) a1;
        System.out.println(b1); // explicit casting
        // 300 --> 32 bits
        // byte can store only 8 bits
        float course = 100f;
        float gst = 18.78f;
        double total= course + gst;
        System.out.println(total);
    }
}
