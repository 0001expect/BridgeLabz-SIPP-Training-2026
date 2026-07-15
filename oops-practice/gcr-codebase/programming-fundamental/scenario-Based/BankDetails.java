import java.util.*;
class BankAccount{
    String accountno ;
    String holder;
    double balance;

    static int totalAccount=0;

    BankAccount(String accountno, String holder, double balance){
        this.accountno = accountno;
        this.holder = holder;
        this balance = balance;
        totalAccount++;

    }
    void deposit(double amount) {
        balance+=amount;
        System.out.println("deposited: "+ amount);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("withdraw: " + amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    void getStatement(){
        System.out.println("\naccountno "+ accountno);
        System.out.println("\nholder "+ holder);
        System.out.println("\nbalance "+ balance);
    }
}
class BankDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new accounts[3];

        for(int i=0; i<3; i++){
            System.out.println("\ninput accountno.: ");
            int accountno = sc.nextInt();

            System.out.println("\ninput holder name: ");
            String holder = sc.nextLine();

            System.out.println("\nbalance: ");
            double balance = sc.nextDouble();

            accounts[i] = new BankAccount(String accountno, String holder, double balance ));

            for (int j = 1; j <= 5; j++) {
                System.out.println("\nTransaction " + j);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                int choice = sc.nextInt();

                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();

                if (choice == 1) {
                    accounts[i].deposit(amount);
                } else if (choice == 2) {
                    accounts[i].withdraw(amount);
                }
            }
        }
        System.out.println("\n----- Account Statements -----");
        for (int i = 0; i < 3; i++) {
            accounts[i].getStatement();

        }
        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);

        sc.close();
    }
}