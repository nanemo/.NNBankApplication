package services.impl;

import entity.User;
import entity.UserBankAccount;
import mysqlservice.ConnectionService;
import services.AccountService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountServiceImpl extends ConnectionService implements AccountService {
    @Override
    public UserBankAccount searchByAccountNumber(long accountNumber) {

        return null;
    }

    @Override
    public boolean addBankAccount(UserBankAccount userBankAccount, User user) {
        try(Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT into users_bank_accounts(bankaccount,accountPassword, iban, currency, balance, associated_fincode, bankaccount_status) values(?,?,?,?,?,?,?)");
            stmt.setLong(1, userBankAccount.getBankAccount());
            stmt.setString(2, userBankAccount.getAccountPassword());
            stmt.setString(3, userBankAccount.getIban());
            stmt.setString(4, userBankAccount.getCurrency());
            stmt.setDouble(5, userBankAccount.getBalance());
            stmt.setString(6, user.getFinCode());
            stmt.setString(7, user.getFinCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deactivateBankAccount(long accountNumber) {

        return false;
    }
}
