import java.util.Arrays;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void game(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rock (0), Paper (1), Scissors (2):");
        String[] num_name = {"rock","paper","scissors"};
        int num = scan.nextInt();
        int num2 = (int) (Math.random() * 3);
        System.out.println("You played "+num_name[num]+". The computer played "+num_name[num2]+".");
        if (num == num2){
            System.out.println("It is a draw!");
        } else if (num == 0 && num2== 2) {
            System.out.println("Rock beats scissors, you win!");
        } else if (num == 2 && num2== 0) {
            System.out.println("Rock beats scissors, you lose!");
        } else if (num == 1 && num2== 0) {
            System.out.println("Paper beats rock, you win!");
        } else if (num == 0 && num2== 1) {
            System.out.println("Paper beats rock, you lose!");
        } else if (num == 2 && num2== 1) {
            System.out.println("Scissors beats paper, you win!");
        } else if (num == 1 && num2== 2) {
            System.out.println("Scissors beats paper, you lose!");
        }
    }
}
