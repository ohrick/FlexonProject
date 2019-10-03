import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class bankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;
    private String type;
    //private String date;

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    // Deposit list
    private List<bankTransaction> depositList;

    // Withdraw list
    private List<bankTransaction> withdrawList;

    // Constructer
    public bankAccount() {
        this.number = "123456789";
        this.balance = 50.0;
        this.name = "Jenny Zhang";
        this.email = "jennyzxy019@gmail.com";
        this.phone = "510-542-7896";
        this.type = "Checking";

        this.depositList = new ArrayList<>();
        this.withdrawList = new ArrayList<>();
    }

    // Show balance
    public void getBalance() {
        System.out.println(this.getDate());
        this.getName();
        this.getType();
        System.out.println("Current Balance:    " + this.balance);
        System.out.println();
    }

    // Get account name
    public void getName() {
        System.out.println("Name:   " + this.name);
    }

    // Get account type
    public void getType() {
        System.out.println("Account Type:   " + this.type);
    }

    // Get date
    public String getDate() {
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);
        return currentTime;
    }

    // Deposit
    public void deposit(double amount) {
        this.balance += amount;

        // add deposit action to transaction history list.
        String t = this.getDate();
        bankTransaction trans = new bankTransaction(t, amount, this.balance);
        this.depositList.add(trans);

        // show user the action status.
        System.out.println("Deposited successfully.");
        this.getBalance();

    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Withdraw failed.");
            this.getBalance();
        } else {
            this.balance -= amount;

            String t = this.getDate();
            bankTransaction trans = new bankTransaction(t, -amount, this.balance);
            this.withdrawList.add(trans);

            System.out.println("Withdraw successfully.");
            this.getBalance();
        }
    }

    // Transaction History
    public void getDepositTransaction() {
        if (this.depositList == null || this.depositList.size() == 0) {
            System.out.println("You don't have any deposit.");
            return;
        }
        System.out.println("Deposit Transactions: ");
        System.out.println("Time || Amount || Balance");
        for (int i = 0; i < this.depositList.size(); i++) {
            bankTransaction t = this.depositList.get(i);
            t.printTransaction();
        }
        System.out.println();
    }

    public void getWithdrawTransaction() {
        if (this.withdrawList == null || this.withdrawList.size() == 0) {
            System.out.println("You don't have any deposit.");
            return;
        }
        System.out.println("Withdraw Transactions: ");
        System.out.println("Time | Amount | Balance");
        for (int i = 0; i < this.withdrawList.size(); i++) {
            bankTransaction t = this.withdrawList.get(i);
            t.printTransaction();
        }
        System.out.println();
    }


}
