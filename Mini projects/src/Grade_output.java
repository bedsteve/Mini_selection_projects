import java.util.Scanner;

public class Grade_output {
    public static void grade_checker(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in your grade as an integer:");
        int grade = scan.nextInt();
        if (grade >= 98 && grade <= 100) {
            System.out.println("A+");
        }
        else if (grade >= 93 && grade <= 97) {
            System.out.println("A");
        }
        else if (grade >= 90 && grade <= 92) {
            System.out.println("A-");
        }
        else if (grade >= 88 && grade <= 89) {
            System.out.println("B+");
        }
        else if (grade >= 83 && grade <= 87) {
            System.out.println("B");
        }
        else if (grade >= 80 && grade <= 82) {
            System.out.println("B-");
        }
        else if (grade >= 78 && grade <= 79) {
            System.out.println("C+");
        }
        else if (grade >= 73 && grade <= 77) {
            System.out.println("C");
        }
        else if (grade >= 70 && grade <= 72) {
            System.out.println("C-");
        }
        else if (grade >= 68 && grade <= 69) {
            System.out.println("D+");
        }
        else if (grade >= 63 && grade <= 67) {
            System.out.println("D");
        }
        else if (grade >= 60 && grade <= 62) {
            System.out.println("D-");
        }
        else if (grade <= 59){System.out.println("F");}
    }
}
