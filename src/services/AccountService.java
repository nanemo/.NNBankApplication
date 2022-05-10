package services;

import entity.UserBankAccount;

public interface AccountService {

    UserBankAccount searchByAccountNumber(long accountNumber);

    boolean addBankAccount(UserBankAccount userBankAccount);

    boolean removeBankAccount(long accountNumber);
}
