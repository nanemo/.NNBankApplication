package entity;

import java.io.Serializable;

public class UserBankAccount implements Serializable {
    private long bankAccount;
    private transient String accountPassword;
    private String iban;
    private String currency;
    private double balance;

    private UserBankAccount() {
    }

    public UserBankAccount(long bankAccount, String accountPassword, String iban, String currency, double balance) {
        this.bankAccount = bankAccount;
        this.accountPassword = accountPassword;
        this.iban = iban;
        this.currency = currency;
        this.balance = balance;
    }

    public UserBankAccount(long bankAccount, String currency, double balance) {
        this.bankAccount = bankAccount;
        this.currency = currency;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserBankAccount{" +
                "bankAccount=" + bankAccount +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                '}';
    }
}
