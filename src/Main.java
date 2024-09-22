//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double interestRate = 0.17;
        double balance = 5000;

            balance = (interestRate * balance) + balance;
            System.out.printf("Your balance after one month is " + balance + ".\n");
            balance = (interestRate * balance) + balance;
            System.out.printf("Your balance after two months is " + balance + ".\n");


    }
    }
