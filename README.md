# 🏦 Bank Management System (Java OOP Practice)

A simple Bank Management System built in Java to practice core Object-Oriented Programming (OOP) concepts including Encapsulation, Constructors, Data Validation, Static Members, Exception Handling, and Business Logic Methods.

## 🚀 Features

- Create bank accounts with validated details
- Deposit money into an account
- Withdraw money from an account
- Prevent invalid transactions
- Maintain account balance securely
- Display account details
- Use a static bank name shared by all accounts

## 📚 OOP Concepts Practiced

### 1. Encapsulation

All account data is declared as `private` and accessed through public methods.

```java
private String accountHolder;
private long accountNumber;
private double balance;
```

This protects sensitive account information from direct modification.

### 2. Constructor Validation

The constructor validates inputs before creating an account.

```java
public BankAccount(String accountHolder,
                   long accountNumber,
                   double balance)
```

Validation checks:

- Account holder name cannot be empty
- Account number must be positive
- Balance cannot be negative

### 3. Getters and Setters

#### Getters

```java
getAccountHolder()
getAccountNumber()
getBalance()
```

Used to safely access account information.

#### Setter

```java
setAccountHolder()
```

Used to update the account holder's name while maintaining validation rules.

### 4. Exception Handling

The program uses `IllegalArgumentException` to handle invalid inputs.

```java
if(balance < 0) {
    throw new IllegalArgumentException(
        "Account Balance cannot be negative"
    );
}
```

This prevents the application from storing invalid data.

### 5. Static Variables and Methods

The bank name is shared among all account objects using a static variable.

```java
private static String bankName = "Zero-Bank";
```

Static method:

```java
public static String getBankName() {
    return bankName;
}
```

### 6. Business Logic Methods

#### Deposit Money

```java
public void deposit(double amount)
```

Rules:

- Deposit amount must be greater than zero.

Example:

```java
account.deposit(2000);
```

#### Withdraw Money

```java
public void withdraw(double amount)
```

Rules:

- Withdrawal amount must be positive.
- Withdrawal amount cannot exceed available balance.

Example:

```java
account.withdraw(1500);
```

## 🗂️ Project Structure

```text
Bank_Management_System/
│
├── BankAccount.java   // Bank account model
└── BankMain.java      // Application entry point
```

## ▶️ Example Usage

```java
BankAccount account =
    new BankAccount(
        "Godwin",
        123456789,
        5000
    );

account.deposit(2000);
account.withdraw(1500);

account.displayAccountDetails();
```

## 📌 Sample Output

```text
Bank Name : Zero-Bank
Account holder : Godwin
Account Number : 123456789
Account Balance : 5500.0
```

### Invalid Withdrawal Example

```java
account.withdraw(10000);
```

Output:

```text
Exception in thread "main" java.lang.IllegalArgumentException: Insufficient balance
```

## 🎯 Learning Outcomes

Through this project, I learned:

- Encapsulation in Java
- Creating and validating objects using constructors
- Using getter and setter methods
- Exception handling with `IllegalArgumentException`
- Working with static variables and methods
- Implementing real-world business logic
- Protecting object state from invalid modifications
- Applying OOP principles in practical applications

## 🔮 Future Improvements

- Multiple bank account management
- Fund transfer between accounts
- Savings and Current Account inheritance
- Transaction history tracking
- Interest calculation
- File/database storage
- Menu-driven application
- User authentication and security features

## 🏃 How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/bank-management-system-java.git
```

### Compile the Program

```bash
javac BankMain.java
```

### Run the Program

```bash
java BankMain
```

## 💡 Purpose

This project was developed to strengthen my understanding of Java Object-Oriented Programming concepts through a real-world banking use case. It focuses on writing clean, maintainable, and secure code while implementing common banking operations such as deposits, withdrawals, and account management.

---

⭐ If you're learning Java OOP, feel free to fork this project, experiment with additional features, and improve the system further.
