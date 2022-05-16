package services;

import services.impl.AccountServiceImpl;
import services.impl.UserServiceImpl;

abstract class ControlImplementations {

    public AccountService getInstanceAccountService() {
        return new AccountServiceImpl();
    }

    public UserService getInstanceUserService() {
        return new UserServiceImpl();
    }

    abstract void asdsd();
}
