import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // User input
        Scanner s = new Scanner(System.in);
        System.out.println("Pleases input a number: ");
        int input = s.nextInt();
        if (input % 2 == 0) {
            System.out.println("It is an even number.");
        } else
            System.out.println("It is an odd number");


        // terminal will stop at "s.nextInt()", and wait for a user input
        // After capturing the user input -> assignment

        // the user input is an odd number
        // the user input is an even number

        // Example 2
        // "Choose an option: 1) Deposit 2) Withdraw 3) Check Balance"
        // if user input 1
        // Question -> "please input the deposit amount:"
        // print out the amount after deposit
        // if user input 2
        // Question -> "please input the Withdrawal amount:"
        // print out the amount after withdrawal
        // if user input 3
        // print out current balance

        Scanner a1 = new Scanner(System.in);
        System.out.println("Pleases input a number: ");
        int money = s.nextInt();
        if (money == 1) {
            Scanner a2 = new Scanner(System.in);
            System.out.println("please input the deposit amount: ");
            int depositamount = s.nextInt();
            System.out.println("the amount deposit is" +" "+ depositamount+".");
        } else if (money == 2) {
            Scanner a3 = new Scanner(System.in);
            System.out.println("please input the withdrawal amount: ");
            int withdrawalamount = s.nextInt();
            System.out.println("the amount withdrawal is" +" "+ withdrawalamount + ".");
        } else if (money == 3) {
            Scanner a4 = new Scanner(System.in);
            System.out.println("the current balance is:" );
        } else {System.out.println("you are only allow to take action between number 1-3");}


    }
}
