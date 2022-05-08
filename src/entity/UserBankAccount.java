package entity;

import java.io.Serializable;

public class UserBankAccount implements Serializable {
    private int bankAccount;
    private transient String accountPassword;
    private String iban;
    private String currency;
    private Integer balance;

    public UserBankAccount() {}

    public UserBankAccount(int bankAccount, String accountPassword, String iban, String currency, Integer balance) {
        this.bankAccount = bankAccount;
        this.accountPassword = accountPassword;
        this.iban = iban;
        this.currency = currency;
        this.balance = balance;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
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

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
