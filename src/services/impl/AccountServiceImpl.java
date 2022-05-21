package services.impl;

import RunTimeExceptions.FinCodeIsExistExceptions;
import entity.User;
import entity.UserBankAccount;
import mysqlservice.ConnectionService;
import services.AccountService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountServiceImpl extends ConnectionService implements AccountService {

    public boolean checkFinCodeForBankAccount(User user) throws FinCodeIsExistExceptions {
        String userFinCode = user.getFinCode();
        UserServiceImpl userService = new UserServiceImpl();

        User result = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("SELECT * FROM user_list WHERE fin_code = " + "'" + userFinCode + "'");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                result = (userService.checkUserFinCodeIsExist(rs));
            }

            if (result == null) {
                throw new FinCodeIsExistExceptions("FinCode doesn't exist");
            }else if (result.getFinCode().equals(userFinCode)) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            return false;

    }

    @Override
    public UserBankAccount searchByAccountNumber(long accountNumber) {

        return null;
    }

    @Override
    public boolean addBankAccount(UserBankAccount userBankAccount, User user) {

        if(checkFinCodeForBankAccount(user) == true) {
            try (Connection c = connect()) {
                PreparedStatement stmt = c.prepareStatement("INSERT INTO users_bank_accounts(bank_account, accountPassword, iban, currency, associated_fincode, bankaccount_status) values(?,?,?,?,?,?);");
                stmt.setLong(1, userBankAccount.getBankAccount());
                stmt.setString(2, userBankAccount.getAccountPassword());
                stmt.setString(3, userBankAccount.getIban());
                stmt.setString(4, userBankAccount.getCurrency());
                stmt.setString(5, user.getFinCode());
                stmt.setString(6, userBankAccount.getBankAccountStatus());
                return stmt.execute();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean deactivateBankAccount(long accountNumber) {

        return false;
    }


}
