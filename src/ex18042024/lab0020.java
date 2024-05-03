package ex18042024;

public class lab0020 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + ++a);
        //part A--> ++a ==11
        //patt b--> + result
        // part c --> ++a ==12
        int b= 20;
        System.out.println(++b + b++ + b++);
        System.out.println(b);
        // part a--> 20
        //part b--> 20+1=21
        //part c -->21+1= 23
    }
}
