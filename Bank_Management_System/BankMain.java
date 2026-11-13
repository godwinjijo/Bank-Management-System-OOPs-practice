package Bank_Management_System;

class BankAccount {
	
	private String accountHolder;
	private long accountNumber;
	private double balance;
	private static String bankName = "Zero-Bank";
	 
	
	
	// CONSTRUCTORS
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		if(accountHolder == null || accountHolder.isBlank()) {
			throw new IllegalArgumentException("Account Holder cannot be Empty");
		}
		this.accountHolder=accountHolder;
		if(accountNumber <= 0) {
			throw new IllegalArgumentException("Account number must be positive");
		}
		this.accountNumber=accountNumber;
		if(balance < 0) {
			throw new IllegalArgumentException("Account Balance cannot be negative");
		}
		this.balance=balance;
	}
	
	
	
	// GETTERS
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	// SETTERS
	public void setAccountHolder(String accountHolder) {
		if(accountHolder == null || accountHolder.isBlank()) {
			throw new IllegalArgumentException("Account Holder cannot be Empty");
		}
		this.accountHolder=accountHolder;
	}
	
//	public void setAccountNumber(long accountNumber) {
//		if(accountNumber <= 0) {
//			throw new IllegalArgumentException("Account number cannot be negative");
//		}
//		this.accountNumber=accountNumber;
//	}
	
//	public void setBalance(double balance) {
//		if(balance < 0) {
//			throw new IllegalArgumentException("Balance cannot be negative");
//		}
//		this.balance=balance;
//	}
	
	
	
	// DEPOSIT AMOUNT
	public void deposit(double amount) {
	    if (amount <= 0) {
	        throw new IllegalArgumentException("Deposit amount must be positive");
	    }
	    this.balance += amount;
	}
	
	
	
	// WITHDRAW AMOUNT FROM THE BANK ACCOUNT
	public void withdraw(double amount) {
	    if (amount <= 0) {
	        throw new IllegalArgumentException("Withdrawal amount must be positive");
	    }
	    if (amount > this.balance) {
	        throw new IllegalArgumentException("Insufficient balance");
	    }
	    this.balance -= amount;
	}
	
	
	
	public void displayAccountDetails() {
		System.out.println("Bank Name : " + bankName);
		System.out.println("Account holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Balance : " + balance);
	}
	
	
	
	public static String getBankName() {
		return bankName;
	}
	
	
	
}



public class BankMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("Godwin", 123456789, 5000);

			account.deposit(2000);
			account.withdraw(1500);
			account.withdraw(10000);

			account.displayAccountDetails();

	}

}
