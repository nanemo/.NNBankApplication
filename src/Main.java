import entity.User;
import entity.UserBankAccount;
import services.UserService;
import services.impl.UserServiceImpl;
import util.LoginUtil;
import util.MenuUtil;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LoginUtil loginUtil = LoginUtil.getLoginObject();
        loginUtil.signIn();

        MenuUtil.showMenu();


    }
}
