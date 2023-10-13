import java.util.Scanner;

public class Lottery {
    public static void Lottery(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a two digit number:");
        Integer num2 = (int) (Math.random() * 90) + 10;
        System.out.println(num2);

        Integer num = scan.nextInt();
        int num_value = 0;

        String str_num = num.toString();
        String str_num2 = num2.toString();

        System.out.println("The lotto number is:" + num2);
        if (str_num.equals(str_num2)){
            System.out.println("YOU GOT IT!!!");
            num_value = 10000;
        } else if (str_num.substring(0,1).equals(str_num2.substring(1,2))  && str_num.substring(1,2).equals(str_num2.substring(0,1))){
            System.out.println("You got both digits correct.");
            num_value = 2000;
        } else if (str_num.substring(0,1).equals(str_num2.substring(1,2))  ) {
            System.out.println("You got one digit correct.");
            num_value = 500;
        } else if (str_num.substring(1,2).equals(str_num2.substring(0,1))) {
            System.out.println("You got one digit correct.");
            num_value = 500;
        } else  {
            System.out.println("You did not win anything :(");
            num_value = 0;
        }
        System.out.println("You win $" + num_value);

    }
}
