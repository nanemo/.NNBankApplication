package entity;

import java.io.Serializable;

public class UserBankAccount implements Serializable {
    private int id;
    private long bankAccount;
    private transient String accountPassword;
    private String iban;
    private String currency;
    private double balance;
    private String bankAccountStatus;

    private UserBankAccount() {
    }

    public UserBankAccount(int id, long bankAccount, String accountPassword, String iban, String currency, double balance, String bankAccountStatus) {
        this.id = id;
        this.bankAccount = bankAccount;
        this.accountPassword = accountPassword;
        this.iban = iban;
        this.currency = currency;
        this.balance = balance;
        this.bankAccountStatus = bankAccountStatus;
    }

    public UserBankAccount(long bankAccount, String currency, double balance) {
        this.bankAccount = bankAccount;
        this.currency = currency;
        this.balance = balance;
    }

    public UserBankAccount(long bankAccount, String accountPassword, String iban, String currency, String bankAccountStatus) {
        this.bankAccount = bankAccount;
        this.accountPassword = accountPassword;
        this.iban = iban;
        this.currency = currency;
        this.bankAccountStatus = bankAccountStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankAccountStatus() {
        return bankAccountStatus;
    }

    public void setBankAccountStatus(String bankAccountStatus) {
        this.bankAccountStatus = bankAccountStatus;
    }

    @Override
    public String toString() {
        return "UserBankAccount{" +
                "id=" + id +
                ", bankAccount=" + bankAccount +
                ", accountPassword='" + accountPassword + '\'' +
                ", iban='" + iban + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", bankAccountStatus='" + bankAccountStatus + '\'' +
                '}';
    }
}
