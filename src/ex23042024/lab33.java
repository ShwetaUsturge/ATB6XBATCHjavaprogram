package ex23042024;

import java.util.Scanner;

public class lab33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(number>20)
        {
            System.out.println("num>20");
    } else if (number>10) {
            System.out.println("Number is between 10 & 20");
        }
        else {
            System.out.println("Number is <20");
        }
        sc.close();
        }
}
