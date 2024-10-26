import java.util.*;

class ATM {
    float balance;
    int PIN = 1223;

    // check PIN
    public void checkPIN() {
        System.out.print("Enter your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enterPIN = sc.nextInt();

        if(enterPIN == PIN) {
            menu();
        }
        else {
            System.out.println("Wrong PIN :)\n");
            checkPIN();
        }
    }

    // Main menu
    public void menu() {
        System.out.println("\nMenu Bar :- ");
        System.out.println("1. Check A/C  Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdrow Money");
        System.out.println("4. Exit!");

        System.out.print("\nEnter Your Choise : ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1) {
            checkBalance();
        }
        else if(opt == 2) {
            depositeMoney();
        }
        else if(opt == 3) {
            withdrowMoney();
        }
        else if(opt == 4) {
            return;
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Balance : " + balance);
        menu();
    }

    // Deposite Money
    public void depositeMoney() {
        System.out.print("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        float deposite = sc.nextFloat();

        balance = balance + deposite;
        System.out.println("Deposite Successfully");

        menu();
    }

    // Withdrow Money
    public void withdrowMoney() {
        System.out.print("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        float withdrow = sc.nextFloat();

        if(balance < withdrow) {
            System.out.println("Enter Sufficient Money");
            withdrowMoney();

        } else {
        balance = balance - withdrow;
        System.out.println("Successfully Withdrow");

        menu();
        }
    }
}

class OOPS {
    public static void main(String args[]) {
        System.out.println("Welcome to ATM Machine :- \n");

        ATM obj = new ATM();
        obj.checkPIN();

        System.out.println("\nExit ATM");
        System.out.println("Thank You :)");
    }
}
