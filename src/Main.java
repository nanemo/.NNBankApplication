import Util.LoginUtil;
import Util.MenuUtil;

public class Main {

    public static void main(String[] args) {
        LoginUtil loginUtil = LoginUtil.getLoginObject();
        loginUtil.signIn();

        MenuUtil.showMenu();


    }
}
