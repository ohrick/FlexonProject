import java.util.*;

class bankAccount {
	String number;
	double balance;
	String name;
	String email;
	String phone;
	
	public bankAccount() {
		this.number = "123456789";
		this.balance = 50.0;
		this.name = "Jenny Zhang";
		this.email = "jennyzxy019@gmail.com";
		this.phone = "510-542-7896";
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited successfully.");
		System.out.println(name + ", your current balance is: " + balance);
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Withdraw failed.");
			System.out.println(name + ", your current balance is: " + balance);
		} else {
			balance -= amount;
			System.out.println("Withdraw successfully.");
			System.out.println(name + ", your current balance is: " + balance);
		}
	}
	
	public void accountDetail() {
		System.out.println("Account details:");
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + number);
		System.out.println("Balance: " + balance);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phone);
	}
}

class bank {
	private bankAccount account;
	public bank() {
		account = new bankAccount();
	}
	public void actions(String s) {
		switch (s) {
			case "1":
				// 1. show account balance 
				System.out.println(account.name + ", your current balance is: " + account.balance);
				break;
			case "2": 
				System.out.println("Choose the amount to deposit: ");
				Scanner s2 = new Scanner(System.in);
				while (true) {
					String line = s2.nextLine();
					if (line.equals("exit")) {
						break;
					}
					double amount = Double.valueOf(line);
					account.deposit(amount);
					break;
				}
				break;
			case "3": 
				System.out.println("Choose the amount to withdraw: ");
				Scanner s3 = new Scanner(System.in);
				while (true) {
					String line = s3.nextLine();
					if (line.equals("exit")) {
						break;
					}
					double amount = Double.valueOf(line);
					account.withdraw(amount);
					break;
				}
				break;
			default:
				System.out.println("Hello, " + account.name);
		}
	}
	
	public static void main(String[] args) {
		bank bankrobot = new bank();
		Scanner s = new Scanner(System.in);
		System.out.println("check balance, press 1");
		System.out.println("deposit, press 2");
		System.out.println("withdraw, press 3");
		while (true) {
			String line = s.nextLine();
			if (line.equals("exit")) {
				break;
			}
			bankrobot.actions(line);
		}
	}
}
