package ex23042024;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class lab034 {
    public static void main(String[] args) {
        // Grade calculator
        // WAP that calculates and display the letter grade for given numeriacl score
        //eg( A.B,C,D,E,F)
        //GRADING SCALE A: 100-90
        //B:80-89
        //C:70-79
        //D: 60-69
        //F:0-59
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the student Score!!");
        int score= sc.nextInt();
        char grade = 'F';
        if(score>= 90 && score<=100)
        {
            grade= 'A';
    } else if (score>=80 && score <=89) {
            grade= 'B';
        } else if (score >= 70 && score<=79) {
            grade= 'C';
        } else if (score >=60 && score<= 69) {
            grade = 'D';
        } else if (score<=0 && score>100) {
            System.out.println("LOL, Are you God?");
            
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is -->"+grade);
        sc.close();

    }
    }
