package ex23042024;

import java.util.Scanner;

public class lab031 {
    public static void main(String[] args) {
        // even an odd numbers
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num %2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }
}
