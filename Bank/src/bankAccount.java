class bankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    // Constructer
    public bankAccount() {
        this.number = "123456789";
        this.balance = 50.0;
        this.name = "Jenny Zhang";
        this.email = "jennyzxy019@gmail.com";
        this.phone = "510-542-7896";
    }

    // Show balance
    public void getBalance() {
        System.out.println(this.name + ", your current balance is: " + this.balance);
        System.out.println();
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

    // Get account name
    public void getName() {
        System.out.println("Hi, " + this.name);
        System.out.println();
    }
}
