package services;

import services.impl.AccountServiceImpl;
import services.impl.UserServiceImpl;

public class BankService {

    public AccountService getInstanceAccountService(){
        return new AccountServiceImpl();
    }

    public UserService getInstanceUserService(){
        return new UserServiceImpl();
    }
}
