package services.impl;

import entity.UserBankAccount;
import services.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public UserBankAccount searchByAccountNumber(long accountNumber) {
        return null;
    }

    @Override
    public boolean addBankAccount(UserBankAccount userBankAccount) {
        return false;
    }

    @Override
    public boolean removeBankAccount(long accountNumber) {
        return false;
    }
}
