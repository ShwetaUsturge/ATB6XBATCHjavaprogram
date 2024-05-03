package ex18042024;

public class lab0014 {
    public static void main(String[] args) {
        boolean a= true;
        System.out.println(!a);
        System.out.println(!(10>20));
        System.out.println(!(30>90));
        System.out.println(!!(30>90));
        System.out.println(!!!(30>90));

        // or gate
        System.out.println("orgate");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false|| false);
    }
}

