public class BankAccount {
    String accountNumber;
    String name;
    double balance;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    BankAccount(String name, String accountNumber, double balance)
     this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
