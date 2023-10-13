import java.util.Scanner;

public class IP_Address {
    public static void IP_Address(String[] args) {
        boolean canRun = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet:");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second octet:");
        int num2 = scan.nextInt();
        System.out.println("Please enter the third octet:");
        int num3 = scan.nextInt();
        System.out.println("Please enter the fourth octet:");
        int num4 = scan.nextInt();
        if (num1> 255) {
            System.out.println("Octet 1 is incorrect");
            canRun = false;
        }
        if (num2> 255) {
            System.out.println("Octet 2 is incorrect");
            canRun = false;
        }
        if (num3> 255) {
            System.out.println("Octet 3 is incorrect");
            canRun = false;
        }
        if (num4> 255) {
            System.out.println("Octet 4 is incorrect");
            canRun = false;
        }
        if (canRun) {
            System.out.println(num1 + "." +num2 + "."+num3 + "."+num4);
        }

    }
}
