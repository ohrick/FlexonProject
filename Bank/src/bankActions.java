import java.util.Scanner;

class bankActions {
    private bankAccount account;

    // Constructer
    public bankActions() {
        account = new bankAccount();
    }

    public void takeActions(String str) {
        switch (str) {
            case "1": // show current balance
                account.getBalance();
                break;
            case "2": // deposit
                System.out.println("Choose the amount to deposit: ");
                Scanner depositScanner = new Scanner(System.in);
                while (true) {
                    String line = depositScanner.nextLine();
                    if (line.equals("exit")) {
                        break;
                    }
                    double amount = Double.valueOf(line);
                    account.deposit(amount);
                    break;
                }
                break;
            case "3": // withdraw
                System.out.println("Choose the amount to withdraw: ");
                Scanner withdrawScanner = new Scanner(System.in);
                while (true) {
                    String line = withdrawScanner.nextLine();
                    if (line.equals("0")) {
                        break;
                    }
                    double amount = Double.valueOf(line);
                    account.withdraw(amount);
                    break;
                }
                break;
            default:
                account.getName();
        }
    }

    // Main Function
    public static void main(String[] args) {
        bankActions robot = new bankActions();
        Scanner s = new Scanner(System.in);
        System.out.println("Check balance, press 1");
        System.out.println("Deposit, press 2");
        System.out.println("Withdraw, press 3");
        System.out.println("Exit, press 0");
        while (true) {
            String line = s.nextLine();
            if (line.equals("0")) {
                break;
            }
            robot.takeActions(line);
        }
    }
}
