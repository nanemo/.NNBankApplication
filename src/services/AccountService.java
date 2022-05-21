package services;

import entity.User;
import entity.UserBankAccount;

public interface AccountService {

    UserBankAccount searchByAccountNumber(long accountNumber);

    boolean addBankAccount(UserBankAccount userBankAccount, User user);

    boolean deactivateBankAccount(long accountNumber);

}
