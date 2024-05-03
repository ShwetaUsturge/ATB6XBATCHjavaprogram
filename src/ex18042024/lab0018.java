package ex18042024;

public class lab0018 {
    public static void main(String[] args) {
        // invrement ++  &  decrement --
        // pre post
        // pre increment --> value is first incremented and then the result is computed
        int a= 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);
        System.out.println("/////" );
//post--> value is first used for computing and then  increment or decrement
int c = 10;
int d= c++;
        System.out.println(d);
        System.out.println(c);
    }
}
