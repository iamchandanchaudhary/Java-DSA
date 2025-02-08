import java.util.*;

class ATM {
    static float balance = 0;
    static int PIN = 1223;
    static Scanner sc = new Scanner(System.in);

    // Check PIN
    public static void checkPIN() {
        System.out.print("\nEnter PIN : ");
        int checkPin = sc.nextInt();

        if(checkPin == PIN) {
            menu();
        } 
        else {
            System.out.println("Wrong Pin!");
            checkPIN();
        }
    }

    // ATM Menu
    public static void menu() {
        System.out.println("\n1.Check Balance");
        System.out.println("2.Deposite Money");
        System.out.println("3.Withdrow Money");
        System.out.println("4.Exit!");

        System.out.print("\nEnter your Choice : " );
        int choice = sc.nextInt();

        if(choice == 1) {
            checkBalance();
        }
        else if(choice == 2) {
            depositeMoney();
        }
        else if(choice == 3) {
            withdrowMoney();
        }
        else if(choice == 4) {
            return;
        } 
        else {
            System.out.println("Please Enter Valid Choice!");
            menu();
        }
    }

    // Balance Checking
    public static void checkBalance() {
        System.out.println("Your Balance : Rs " + balance);

        menu();
    }

    // deposite money
    public static void depositeMoney() {
        System.out.print("\nEnter Amount : ");
        float deposite = sc.nextFloat();

        balance = balance + deposite;
        System.out.println("Deposite Successful");

        menu();
    }

    // Withdrow Money
    public static void withdrowMoney() {
        System.out.print("Enter Amount : ");
        float withdrow = sc.nextFloat();

        if(withdrow > balance) {
            System.out.println("Low Balance!\n");
            withdrowMoney();
        } 
        else {

            balance = balance - withdrow;
            System.out.println("\nWithdrowl Successful");
            System.out.println("Amount " + withdrow + " Rs withdrowl");

            menu();
        }
    }
}

class OOPS {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Machine");

        ATM obj = new ATM();
        obj.checkPIN();

        System.out.println("Thank You :)\n");
    }
}