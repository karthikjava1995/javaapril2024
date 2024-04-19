package com.javatraining.condition;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for five subjects:");
        
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        System.out.print("Subject 5: ");
        int subject5 = scanner.nextInt();

        double average = (subject1 + subject2 + subject3 + subject4 + subject5) / 5.0;

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + getGrade(average));

        scanner.close();
    }

    public static char getGrade(double average) {
        char grade;

        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        return grade;
    }
}
