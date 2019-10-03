import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class bankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;
    private String type;
    private LocalDate day;

    // Constructer
    public bankAccount() {
        this.number = "123456789";
        this.balance = 50.0;
        this.name = "Jenny Zhang";
        this.email = "jennyzxy019@gmail.com";
        this.phone = "510-542-7896";
        this.type = "Checking";
        this.day = LocalDate.now();
    }

    // Show balance
    public void getBalance() {
        this.getDate();
        this.getName();
        this.getType();
        System.out.println("Current Balance:    " + this.balance);
        System.out.println();
    }

    // Get account name
    public void getName() {
        System.out.println("Hi, " + this.name);
    }

    // Get account type
    public void getType() {
        System.out.println("Account Type:   " + this.type);
    }

    // Get date
    public void getDate() {
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(this.day));
    }

    // Deposit
    public void deposit(double amount) {
        this.balance += amount;
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
            System.out.println("Withdraw successfully.");
            this.getBalance();
        }
    }
}
